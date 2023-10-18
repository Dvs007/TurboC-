import tkinter as tk 
window = tk.Tk()
window.title("Case changer")
window.geometry("200x100")

def upper_case():
    result = entry.get()
    lbl.config(text=result.upper())
    
def lower_case():
    result = entry.get()
    lbl.config(text=result.lower())
    

entry = tk.Entry(window)
entry.pack()

b1 = tk.Button(window,text="Uppercase",command = upper_case )
b1.pack()

b2 = tk.Button(window,text="Lowercase",command = lower_case )
b2.pack()

lbl = tk.Label(window,text="")
lbl.pack()

window.mainloop()