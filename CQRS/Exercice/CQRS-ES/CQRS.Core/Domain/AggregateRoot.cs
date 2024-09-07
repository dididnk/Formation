using CQRS.Core.Events;

namespace CQRS.Core.Domain
{
	public class AggregateRoot
	{
		public Guid _id;
		public readonly List<BaseEvent> _changes = new();

		public Guid Id
		{
			get { return _id; }
		}
		public int Version { get; set; } = -1;

		public IEnumerable<BaseEvent> GetUncommittedChanges()
		{
			return _changes;
		}

		public void MarkChangesAsCommitted()
		{
			_changes.Clear();
		}

		public void ApplyChnages(BaseEvent @event, bool isNew)
		{
			var method = this.GetType().GetMethod("Apply", new Type[] { @event.GetType() });

			if (method == null)
			{
				throw new ArgumentException(nameof(method), $"The Apply method was not found in aggregate for {@event.GetType().Name} !");
			}

			method.Invoke(this, new object[] { @event });

			if (isNew)
			{
				_changes.Add(@event);
			}
		}

		protected void RaiseEvent(BaseEvent @event)
		{
			ApplyChnages(@event, true);
		}

		public void ReplayEvents(IEnumerable<BaseEvent> events)
		{
			foreach (var @event in events)
			{
				ApplyChnages(@event, false);
			}
		}
	}
}
