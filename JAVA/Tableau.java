public class Tableau {
    public static void main(String[] args)
    {
        int[][] tab =
        {
            {1, 2, 3},
            {2, 4, 5}
        };
        for(int[] tableau: tab)
        {
            for(int element_tableau: tableau)
                System.out.println(element_tableau);
        }
        
        for(int i  = 0; i < tab.length; i++)
        {
            for(int j = 0; j < tab[i].length; j++)
            {
                System.out.println(tab[i][j]);
            }
        }
    }  
}