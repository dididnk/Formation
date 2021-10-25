package mypackage;

abstract public class LivinSpecies 
{
    protected String l_name;

    public String whoAmI()
    {
        return l_name;
    }
    abstract public void eat();
    abstract public void speak();
}
