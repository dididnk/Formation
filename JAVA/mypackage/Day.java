package mypackage;

public enum Day 
{
    MATIN(8, "Bonne application pour la fac :)"), 
    MIDI(12, "C'est l'heure d'aller au resto bg :)"), 
    APREMIDI(14, "Fini la pause il faut retourner en classe :("), 
    SOIR(18, "Rentre bien"), 
    NUIT(2, "Bonne nuit");

    private int hour;
    private String msg;

    Day(int hour, String msg)
    {
        this.hour   = hour;
        this.msg    = msg;
    }
    public int getHour()
    {
        return this.hour;
    }
    public String getMsg()
    {
        return this.msg;
    }
    public void whatMoment()
    {
        System.out.println("C'est le " + this.name().toLowerCase() + " Il est actuellement "+ this.getHour() + "H " + getMsg());
    }
}
