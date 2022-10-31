
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercice
{
    internal class Fichier
    {
        private string fileContain;
        private string fileName;
        public Fichier(string fileContain = "print('Bonjour le monde')", string fileName = "main.py")
        {
            this.fileContain = fileContain;
            this.fileName = fileName;
        }
        public void doExercice()
        {
            File.WriteAllText (fileName, fileContain);
        }
    }

}
