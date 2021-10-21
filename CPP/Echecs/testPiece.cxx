/**
 * Programme test de Piece
 *
 * @file testPiece.cxx
 */

// Utile pour l'affichage
#include <iostream>
#include "Piece.h"
#include "Joueur.h"
#include "Echiquier.h"

// Pour utiliser les flux de iostream sans mettre "std::" tout le temps.
using namespace std;

bool compare_position(Piece & p, Piece & q)
{
    // q.operator=(p); # copy le contenu de p dans q
    q = p;
    q.affiche();
    return (p.x()==q.x())  && (p.y()==q.y());

};
/**
 * Programme principal
 */
int
main( int argc, char **argv )
{
    // instancie un objet p1 de type Piece
    Piece p1;
    // p1 est une piece blanche de coordonnees (3,3)
    p1.init( 3, 3, true );
    if (p1.isBlack())
        cout << "Piece noire" << endl;
    Piece p2( 4, 4, false );
    p1.affiche();
    p2.affiche();

    

    if (compare_position(p1,p2))
        cout << "même position"<<endl;

    else
    {
        cout << "Différente position"<<endl;
    }
     
     // allocation
     Piece *ptr = allouerPiece(7, 7, true);
     ptr->affiche();
     p1 = *ptr;
     *ptr = p2;
     ptr->affiche();
     delete ptr;

    Echiquier e;
    e.affiche();

/*

    Joueur jb( true );
    Joueur jn( false );
    jb.affiche();
    jn.affiche();
*/
    // les objets definis dans cette fonction sont automatiquement detruits.
    // Ex : p1
}
