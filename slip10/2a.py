import tkinter as tk
from tkinter.messagebox import *


window = tk.Tk()
window.geometry("300x200")

def onClick():
    tk.messagebox.showwarning("Alert msg","Helloworld")

button = tk.Button(window,text = "Click Me", command = onClick)
button.pack()
window.mainloop()






