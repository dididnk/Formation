package mypackage;
import java.util.*;

public class MyTimer extends TimerTask
{
    public int time = 5;
    public void run()
    {
        System.out.println("Le programme se ferme dans : " + time + " seconde");
        if(time == 0)
        {
            Day moment = Day.MATIN;
            Random r = new Random();
            int tmp = r.nextInt(6 - 1) + 1;
            if(tmp == 1 || tmp == 2)
                moment = Day.MATIN;  
            else if (tmp == 3 || tmp == 4)  
                moment = Day.MIDI; 
            else if (tmp == 5 || tmp == 6)  
                moment = Day.APREMIDI;
            else if (tmp == 7 || tmp == 8)  
                moment = Day.SOIR;
            else 
                moment = Day.NUIT;
            moment.whatMoment();
            System.out.println("Au revoir !");
            cancel();
        }
        time--;
    }
}
