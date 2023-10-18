import tkinter as tk
window = tk.Tk()

def check(digit):
    if digit== '0':
        lbl.configure(text="Zero")
    elif digit == '1':
        lbl.configure(text="One")
    elif digit == '2':
        lbl.configure(text="Two")
    elif digit == '3':
        lbl.configure(text="Three")
    elif digit == '4':
        lbl.configure(text="Four")
    elif digit == '5':
        lbl.configure(text="Five")
    elif digit == '6':
        lbl.configure(text="Six")
    elif digit == '7':
        lbl.configure(text="Seven")
    elif digit == '8':
        lbl.configure(text="Eight")
    elif digit == '9':
        lbl.configure(text="Nine")        
            

def digit():
    N = entry.get()
    
    i=0
    
    while i < len(N):
        check(N[i])
        i+=1
    
    
    
entry = tk.Entry(window)
entry.pack()

btn = tk.Button(window,text="Show",command = digit)
btn.pack()

lbl = tk.Label(window,text="dummy", font=("Callibre",10,'bold'))
lbl.pack()



