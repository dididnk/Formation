package Fait;
import mypackage.*;

class Heritage
{
    public static void main(String[] args) throws Exception
    {
        Horse h = new Horse("Messi");
        h.move(167, 428);

        Pegasus p = new Pegasus("Ronaldo");
        p.move(33, 146);
        p.fly(466);
    }
}
