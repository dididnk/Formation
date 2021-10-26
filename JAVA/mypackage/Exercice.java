package mypackage;
import java.util.Timer;

public class Exercice 
{
    public static void main(String[] ars)
    {
        Timer chrono = new Timer();
        MyTimer mt = new MyTimer();
        System.out.println("Demarrage du programme, temps exacte " + mt.time );
        chrono.schedule(new MyTimer(), 1000, 1000);
        //System.out.println("Bonjour");
    }    
}
