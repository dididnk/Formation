package mypackage;

public class Horse 
{
    // Propriété
    protected String m_name;
    protected int m_x;
    protected int m_y;

    // Constante
    final protected int m_default_position = 50;

    /**
     * Constructeur de Horse
     * @param name : nom de Horse
     */
    public Horse(String name)
    {
        this.m_name = name;
        this.m_x = this.m_y = m_default_position;
        // this.m_x    = m_default_position;
        // this.m_y    = m_default_position;
        actualPosition(this.m_x, this.m_y);
    }
    public void move(int x, int y) throws Exception
    {
        try 
        {
            if (x >= 0 && y >= 0)
            {
                this.m_x = x;
                this.m_y = y;
            }
        } 
        catch (Exception e)
        {
            System.out.println("coordonnees invalides !");
        }
    }
    public void actualPosition(int x, int y)
    {
        System.out.println("Actuelle position ( x = "+ x +", y = " + y + " )");
    }
}
