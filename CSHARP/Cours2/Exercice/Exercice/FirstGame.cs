using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercice
{
    internal class FirstGame
    {
        private bool gameOver;
        public FirstGame()
        {
            this.gameOver = false;
        }
        public void start()
        {
            showTtitle();
            showRules();

            string EAST = "E";
            string WEST = "O";
            string DOR = "P";
            string WINDOW = "F";
            string direction = "";
            string getInside = "";

            while(gameOver == false)
            {
                Console.Write("Vous êtes dans une forêt. Aller à l'est < E >  ou à l'ouest < O > ? ");
                direction = Console.ReadLine().ToUpper();

                if(direction == EAST || direction == WEST)
                {
                    if (direction == WEST) gameOverMessage();
                    else
                    {
                        getInside = goingToCastle();

                        if (getInside == DOR) gameOverMessage();
                        else if (getInside == WINDOW) winTheGame();
                        else
                        {
                            Console.WriteLine("\n________________________________________________________________\n");
                            Console.WriteLine("Voissez un moyen d'entrée valide. [ P : porte ou F : fenêtre ]");
                            goingToCastle();
                        }
                    }
                }
                else
                {
                    Console.WriteLine("\n________________________________________________________________\n");
                    Console.WriteLine("Entrez une direction valide. [ E :  Est ou  O : Ouest ]");
                }
            }
        }
        public void showTtitle()
        {
            // Style de police: banner3
            Console.WriteLine(" ######      ###    ##     ## ########");
            Console.WriteLine("##    ##    ## ##   ###   ### ##       ");
            Console.WriteLine("##         ##   ##  #### #### ##       ");
            Console.WriteLine("##   #### ##     ## ## ### ## ######   ");
            Console.WriteLine("##    ##  ######### ##     ## ##       ");
            Console.WriteLine("##    ##  ##     ## ##     ## ##       ");
            Console.WriteLine("######    ##     ## ##     ## ######### \n");
        }
        public void showRules() { }
        public string goingToCastle()
        {
            Console.WriteLine("Vous allez au châteaux libérer la princesse Jade.");
            Console.WriteLine("\n_______________________________________________________________________");
            Console.WriteLine("\nVous êtes arrivé devant la porte.\nVous entrez par la porte < P > ou par la fenêtre < F > ?");
            return Console.ReadLine();
        }
        public void winTheGame()
        {
            Console.WriteLine("Félicitations ! vous avez gagné :D");
            this.gameOver = true;
        }
        public void gameOverMessage()
        {
            Console.WriteLine("Vous avez perdu :)");
            this.gameOver = true;
        }
    }
}
