import java.util.StringTokenizer;

public class StringBuilder_StringBuffer {
    public static void main(String[] args)
    {
        String s = "new/titre-de-la-news/14";
        String s1 = "new/titre-de-la-news/14";
        /* 
          StringTokenizer(s, "/"):  recupère new, titre-de-la-news et 14
          StringTokenizer(s, "/", true): fait la même chose mais + /
        */
        StringTokenizer st = new StringTokenizer(s, "/"); 
        StringTokenizer st1 = new StringTokenizer(s1, "/", true);

        System.out.println("--------------------------");
        while(st.hasMoreTokens())
            System.out.println(st.nextToken());
            
        System.out.println("--------------------------");
        while(st1.hasMoreTokens())
            System.out.println(st1.nextToken());
        
        // STRING BUILDER
        // StringBuilder == StringBuffer
        System.out.println("------------STRING BUILDER--------------");

        StringBuilder sb = new StringBuilder(" je m'appelle ");
        sb.insert(0, "Bonjour");
        sb.append("Emmanuel");
        sb.insert(sb.length(), " NGBAME");

        // affichage
        System.out.println(sb);
        System.out.println("Taille de la phrase     : "+ sb.length());
        System.out.println("Capacity de la phrase   : "+ sb.capacity());
    }
}
