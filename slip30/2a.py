import tkinter as tk
window = tk.Tk()

def check():
    string=entry1.get()
    lbl2.configure(text=string)
    
    character = entry2.get()
    lbl3.configure(text = string.count(character))
    
entry1 = tk.Entry(window)
entry1.pack()
entry2 = tk.Entry(window)
entry2.pack()

btn = tk.Button(window,text="Check",command=check)
btn.pack()

lbl1 = tk.Label(window,text="Original string")
lbl1.pack()
lbl2 = tk.Label(window,text="")
lbl2.pack()
lbl3 = tk.Label(window,text="")
lbl3.pack()

window.mainloop()