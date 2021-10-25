package mypackage;

public final class Pegasus extends Horse
{
    // Propriétés
    protected int p_z;

    // Constante
    final protected int p_default_position = 0;

    /**
     * Constructeur de Pegasus
     * @param name : Nom de pegasus
     */
    public Pegasus(String name)
    {
        super(name);
        actualPosition(this.m_x, this.m_y);
        this.p_z = p_default_position;
    }
    public void fly(int z)
    {
        this.p_z = z;
    }
}
