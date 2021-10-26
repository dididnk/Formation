package Fait;
import game.*;

class Polymorphisme
{
    public static void main(String[] args) throws Exception
    {
        // Le polymorphisme dans la déclaration

        Flyable[] elements = {new Ship(), new Cottage(), new Cottage()};

        // Instaciations

        for(Flyable f: elements)
            f.fly("Gaz");
        

        System.out.println("Hello world");
    }
}