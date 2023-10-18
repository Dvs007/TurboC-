import tkinter as tk 
window = tk.Tk()
def cal():
    pi=3.14
    r = float(entry.get())
    volume = 4.0/3.0*pi*r**3
    
    lbl.configure(text=volume)
entry = tk.Entry(window)
entry.pack()
btn=tk.Button(window,text="Calculate",command=cal)
btn.pack()
lbl = tk.Label(window,text="")
lbl.pack()
window.mainloop()