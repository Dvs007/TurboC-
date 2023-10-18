
from tkinter import *
import tkinter.font
window = tkinter.Tk()
window.title("font and label")
window.geometry("500x300")
lb = Label(text="Helloworld")
lb.pack()
sample = tkinter.font.Font(family='Arial',size=10,weight='normal')
font1 = tkinter.font.Font(family='Arial',size=30,weight='bold')
font2 = tkinter.font.Font(family='Comic Sans MS',size=30,weight='normal')
font3 = tkinter.font.Font(family='Calibry',size=30,weight='bold')
font4 = tkinter.font.Font(family='Sans Serif',size=30,weight='normal')

def ischecked1():
    if cb1.get() == 1:
         lb.configure(font = font1)
    elif cb1.get() == 0:
         lb.configure(font = sample)
    
         
def ischecked2():
    if cb2.get() == 1:
         lb.configure(font = font2)
    elif cb2.get() == 0:
         lb.configure(font = sample)

def ischecked3():
    if cb3.get() == 1:
         lb.configure(font = font3)
    elif cb3.get() == 0:
         lb.configure(font = sample)
         
def ischecked4():
    if cb4.get() == 1:
         lb.configure(font = font4)
    elif cb4.get() == 0:
         lb.configure(font = sample)
         
         
cb1= IntVar()
cb2= IntVar()
cb3= IntVar()
cb4= IntVar()
    
     

Checkbutton(window,text='Arial',variable=cb1,onvalue = 1,offvalue=0,command = ischecked1).place(x=40,y=50)
Checkbutton(window,text='Comic Sans MS',variable=cb2,onvalue = 1,offvalue=0,command = ischecked2).place(x=40,y=80)
Checkbutton(window,text='Calibry',variable=cb3,onvalue = 1,offvalue=0,command = ischecked3).place(x=40,y=120)
Checkbutton(window,text='Sans Serif',variable=cb4,onvalue = 1,offvalue=0,command = ischecked4).place(x=40,y=150)

