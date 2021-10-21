#coding:utf-8

from tkinter import *
from typing import Dict, List, Set, Tuple, Union, TypeVar

root = Tk()
title: str = "Havre Game" # Title of the game
root.title(title)

WINDOW_X: int = root.winfo_screenwidth() # screen width
WINDOW_Y: int = root.winfo_screenheight() # screen heigth

game = "{}x{}".format(WINDOW_X, WINDOW_Y) # Position the screen in the center of the screen
root.resizable(False, False)
root.geometry(game)

# FONCTIONS
def show_about():
    about_window = Toplevel(root)
    about_window.title("About")
    about_window.geometry(game)
    image = PhotoImage(file="title.png")
    label = Label(bg ="#808080", image = image)
    about_window.grab_set()
    label.pack()

# MENU
main_menu = Menu(root)



first_menu = Menu(main_menu, tearoff = 0)
first_menu.add_command(label= "Option1", )
first_menu.add_command(label= "Option2")
first_menu.add_command(label= "Option3")

second_menu = Menu(main_menu, tearoff = 0)
second_menu.add_command(label= "Option5")
second_menu.add_command(label= "Option6")
second_menu.add_command(label= "About", command=show_about)
second_menu.add_separator()
second_menu.add_command(label= "Quit", command = root.quit)


main_menu.add_cascade(label="First", menu=first_menu)
main_menu.add_cascade(label="Second", menu=second_menu)




# Program start
root.config(menu=main_menu)
root.mainloop()
