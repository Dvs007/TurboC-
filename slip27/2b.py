import tkinter as tk
window = tk.Tk()

def conbin():
    dec = int(entry.get())
    lbl.configure(text = bin(dec))
    
def conoct():
    dec = int(entry.get())
    lbl.configure(text = oct(dec))
    
def conhex():
    dec = int(entry.get())
    lbl.configure(text = hex(dec))
    
    
entry = tk.Entry(window)
entry.pack()
btn1 = tk.Button(window,text="Convert Binary",command=conbin)
btn1.pack()
btn2 = tk.Button(window,text="Convert Octal",command=conoct)
btn2.pack()
btn3 = tk.Button(window,text="Convert Hexa",command=conhex)
btn3.pack()

lbl = tk.Label(window,text="")
lbl.pack()

window.mainloop()

