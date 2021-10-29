package Fait;

public class Cat 
{
    // Propriété
    protected String c_name;

    public Cat(String name)
    {
        this.c_name = name;
    }
    public void speakCat()
    {
        System.out.println("Miau ! je m'appelle "+ this.c_name +".");
    } 
}
