package game;

public class Cottage extends Building implements Flayable
{
    public Cottage()
    {
        System.out.println("Parcelle construite");
    }

    public void build(String material)
    {
        System.out.println("Construction du batiment en  "+ material);
    }
    public void fly(String energy)
    {
        System.out.println("Je me propulse dans les airs avec du " + energy);
    }
}
