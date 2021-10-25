package game;

public class Ship extends Vehicule implements Flayable
{
    public Ship()
    {
        this.m_MouvementSpeed = 16;
    }

    public void moveXY(int x, int y)
    {
        System.out.println("Le navire brasse les flots et se deplace en " + x + ", " + y);
    }
    public void fly(String energy)
    {
        System.out.println("Je me propulse dans les airs avec du " + energy);
    }
}
