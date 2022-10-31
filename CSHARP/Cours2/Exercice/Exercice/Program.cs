using System;
using System.Linq;
namespace Exercice
{
    class Program
    {
        static void Main(string[] args)
        {

            string[] listOfLanguages1 = new string[] { "HTML", "CSS", "JavaScript", "PHP", "Aurélia", "Wordpress" };
            string[] listOfLanguages2 = new string[] { "C#", "Python", "Java", "PHP", "C", "C++", "Ocaml", "Delphi", "Visual basic"};

            var difference = differenceOfTwoStringList(listOfLanguages1, listOfLanguages2);
            foreach (var language in difference)
            {
                Console.WriteLine(language);
            }
        }
        static string[] differenceOfTwoStringList(string[] l1, string[] l2)
        {
            var difference = (l1.Except(l2)).ToArray();
            difference = difference.Length > 0 ? difference : (l2.Except(l1)).ToArray();
            return difference;
        }

    }
}