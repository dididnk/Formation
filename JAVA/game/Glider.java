package game;

public class Glider extends Vehicule
{
    public Glider()
    {
        this.m_MouvementSpeed = 28;
    }
    public void moveXY(int x, int y)
    {
        System.out.println("Le planeur fend l'air vers " + x + ", " + y );
    }
}
