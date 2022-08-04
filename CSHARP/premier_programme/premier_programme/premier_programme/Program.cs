using System;

namespace premier_programme // Note: actual namespace depends on the project name.
{
    class Program
    {
        static void start_game()
        {
            Console.WriteLine("============= JEU DE DEVINETTE =============");
            Console.WriteLine("Entrez un nombre entre 1 et 10 : ");
            string nomber = Console.ReadLine();
            //Random guessNomber = Random(10);
            int guessNomber = 7;
            int cpt = 3;
            int tour = 0;
            if (nomber.Trim().Length > 0) {
                try
                {
                    int realNomber = int.Parse(nomber.Trim());
                    while(cpt != 0)
                    {
                        if(realNomber == guessNomber)
                        {
                            Console.WriteLine($"Vous avez reussi dans la {tour}! le nombre était bien {guessNomber}");
                            return 10;
                            break;
                        }else if( realNomber > guessNomber)
                        {
                            Console.WriteLine("le nombre magique est plus grand ! ");
                            Console.WriteLine($"Il vous reste {tour--} essai.");
                            cpt--;
                            return start_game();
                        }
                        else
                        {
                            Console.WriteLine("le nombre magique est plus grand ! ");
                            Console.WriteLine($"Il vous reste {tour--} essai.");
                            cpt--;
                            return start_game();
                        }
                    }
                }
                catch
                {
                    Console.WriteLine("veillez entrer un nombre valide ! ");
                }
            }

        }
        static void Main(string[] args)
        {

            int jeu = start_game();
        }

    }
}