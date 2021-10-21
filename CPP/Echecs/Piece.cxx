/**
 * Mise en oeuvre de Piece.h
 *
 * @file Piece.cxx
 */

// Utile pour l'affichage
#include <iostream>
// A besoin de la declaration de la classe
#include "Piece.h"

// Pour utiliser les flux de iostream sans mettre "std::" tout le temps.
using namespace std;

Piece::Piece()
{
    // ne fait rien => objet instancie mais non valide.
    cout << "Constructeur Piece par defaut" << endl;
}

Piece::Piece( int x, int y, bool white )
{
    m_x     = x;
    m_y     = y;
    m_white = white;
    cout << "Constructeur Piece special" << endl;
}

Piece::~Piece()
{
    cout << "Destructeur Piece" << endl;
}

Piece ::Piece(const Piece & autre)
{
    m_x     = autre.m_x;
    m_y     = autre.m_y;
    m_white = autre.m_white;

    cout<< "constructeur de piéce par copie"<<endl;
    }

Piece &
Piece::operator=(const Piece & autre)
{
    m_x     = autre.m_x;
    m_y     = autre.m_y;
    m_white = autre.m_white;
    return *this;
    cout<< "affectation de piéce "<<endl;
}

void
Piece::init( int x, int y, bool white )
{
    m_x     = x;
    m_y     = y;
    m_white = white;
}

void
Piece::move( int x, int y )
{
    m_x = x;
    m_y = y;
}

int
Piece::x()
{
    return m_x;
}

int
Piece::y()
{
    return m_y;
}

bool
Piece::isWhite()
{
    return m_white;
}

bool
Piece::isBlack()
{
    return !m_white;
}

void
Piece::affiche()
{
    cout << "Piece: x=" << m_x << " y=" << m_y << " "
         << ( m_white ? "blanche" : "noire" ) << endl;
}
Piece
*allouerPiece(int x, int y, bool white)
{
    Piece *ptr = new Piece(x, y, white);
    return ptr;
}