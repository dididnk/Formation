package Fait;
import java.util.PriorityQueue;
import java.util.Iterator;

/*
    PriorityQueue   : File
    ArraDeque       : Liste doublement chaînée
*/
public class File 
{
    public static void main(String[] ars)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(255);
        pq.add(1);
        pq.add(22);
        pq.add(-1);
        pq.add(7);
        pq.add(10);
        pq.add(255);

        Iterator<Integer> it = pq.iterator();
        while(it.hasNext())
            System.out.println(it.next());
        //System.out.println("Bonjour");
    }    
}
