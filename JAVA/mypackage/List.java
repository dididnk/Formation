import mypackage.Cat;
import java.util.ArrayList; // Vector, LinkedList (liste chaînée)

public class List 
{
    public static void main(String[] ars)
    {
        // On crée une liste de type Cat
        ArrayList<Cat> catList = new ArrayList<Cat>(); // Vector, LinkedList (liste chaînée)

        // On instancie la classe Cat
        Cat Tom = new Cat("Tom");
        Cat Jerry = new Cat("Jerry");
        Cat Miney = new Cat("Miney");
        
        // On ajoute les éléments dans la liste
        catList.add(Tom);
        catList.add(Jerry);
        catList.add(Miney);

        System.out.println("Faire parler les chats\n-----------------------");
        for(Cat c: catList)
            c.speakCat();
    }    
}
