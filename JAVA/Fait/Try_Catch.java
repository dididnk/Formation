package Fait;
import java.util.*;

class Try_Catch
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        final int actual_year = 2021;

        try
        {
            System.out.println("Annee de naissance :");
            int year = actual_year - sc.nextInt();
            System.out.println("Vous avez " + year + " ans" + " en " + actual_year);

            // Test si majeur ou pas 
            if(year > 18)
                System.out.println("Vous etes majeur"); 
            else
                System.out.println("Vous etes mineur");

            // fermeture de la lecture au clavier
            sc.close();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Veillez saisir un nombre");
            System.out.println("ERREUR : " + e.getMessage());
        }
    }
}
