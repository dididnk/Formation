#if !defined Joueur_h
#define Joueur_h

#include "Piece.h"

class Joueur
{
   private:
    bool m_white;
    Piece m_pieces[16];

   public:
    Joueur( bool white );
    bool isWhite();
    void affiche();
};

#endif