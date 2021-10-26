package Fait;
import java.util.HashSet;
import java.util.HashMap;

/*
    HashSet :   accès direct
    TreeSet :   pas accès direct (trié)
*/

public class HashSet_HashMap 
{
    public static void main(String[] ars)
    {
        // Instanciations
        HashSet<Integer> hs = new HashSet<Integer>();
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        // Ajout
        hs.add(24);
        hs.add(32);
        hs.add(22);

        hm.put("Emmanuel", 22);
        hm.put("Sam", 24);
        hm.put("Awa", 32);

        
        //System.out.println("Bonjour");
    }    
}
