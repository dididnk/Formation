
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Scanner_BufferReader 
{
    /*
        BufferedReader    -> lecture de chaîne de caractères (String)
                        _ read()        : lire un Char
                        _ readLine()    : Lire une chaîne
                        _ skip(N)       : ignore N caractères

        Scanner         -> lecture de données + parsing 
     */
    public static void main(String[] args) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in); //lis depuis le clavier
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Comment t'appelles-tu ?");
        String name = br.readLine();
        System.out.println("Bonjour " + name);

        Scanner sc = new Scanner(System.in);
        System.out.println("Acceder a quel niveau ? ");
        int game_level = sc.nextInt();

        System.out.println(game_level);
        sc.close();
    }
}
