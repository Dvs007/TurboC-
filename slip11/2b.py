from tkinter import *
window = Tk()
window.title("menu bar")
window.geometry("400x300")

def bgred():
    window.config(bg = 'red')
    
def bgyellow():
    window.config(bg = 'yellow')
    
def bggreen():
    window.config(bg = 'green')
    
def mred():
    BG_Colors.config(background = 'red',fg = 'white')
    BG_Menu_Colors.config(background = 'red',fg = 'white')
    
def myellow():
    BG_Colors.config(background = 'yellow',fg = 'black')
    BG_Menu_Colors.config(background = 'yellow',fg = 'black')

def mgreen():
    BG_Colors.config(background = 'green',fg = 'white')
    BG_Menu_Colors.config(background = 'green',fg = 'white')
    

menubar =  Menu(window,background = 'yellow',fg = 'black')

BG_Colors = Menu(menubar,tearoff = False)
BG_Menu_Colors = Menu(menubar,tearoff = False)

BG_Colors.add_command(label = 'Red',command = bgred)
BG_Colors.add_command(label = 'Yellow',command = bgyellow)
BG_Colors.add_command(label = 'Green',command = bggreen)

BG_Menu_Colors.add_command(label = 'Red',command = mred)
BG_Menu_Colors.add_command(label = 'Yellow',command = myellow)
BG_Menu_Colors.add_command(label = 'Green',command = mgreen)

menubar.add_cascade(label='BG_Colors',menu=BG_Colors)
menubar.add_cascade(label='BG_Menu_Colors',menu=BG_Menu_Colors)
window.config(menu=menubar)
window.mainloop()