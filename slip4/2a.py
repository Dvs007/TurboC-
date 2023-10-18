
from tkinter import *
import random

window = Tk()
window.geometry("500x500")
window.title("changing colors")

def windowconfig():
    color = '#'+("%06x" % random.randint(0,0xFFFFFF))
    window.configure(background=str(color))
    window.after(1000,windowconfig)

windowconfig()
window.mainloop()
   