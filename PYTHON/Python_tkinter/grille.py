# !/usr/bin/env python

# -- coding: utf-8 --

from tkinter import *

import math

import random

def rectangle_automatique(leCanvas, x0, y0, largeur, hauteur, bordure, couleur1, couleur2, couleur3):
    leCanvas.create_rectangle(x0 + bordure // 2, y0 + bordure // 2, x0 + largeur - bordure // 2,
                              y0 + hauteur - bordure // 2, fill=couleur1, activefill=couleur2, outline=couleur3,
                              width=bordure)

fen_princ = Tk()

fen_princ.title("ESSAI AVEC CANVAS")

fen_princ.geometry("600x600")

monCanvas = Canvas(fen_princ, width=464, height=464, bg='ivory', bd=0, highlightthickness=0)

monCanvas.place(x=50, y=50)

test_couleur = True

warehouse = [3, 6, 8, 10, 11, 11]

cpt = 0


for y in range(len(warehouse)):

    for x in range(warehouse[cpt]):
        #for x in range(n_col):

        #if test_couleur:
        rectangle_automatique(monCanvas, x * 46, y*50, 50, 50, 4, "#888888", "yellow", "black")

    cpt = cpt + 1

fen_princ.mainloop()