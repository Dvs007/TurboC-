import tkinter as tk

window = tk.Tk()
window.geometry("300x200")

def volume(): 
    pi = 22/7
    height = txtheight.get(1.0,"end-1c")
    radius = txtradius.get(1.0,"end-1c")
    volume = pi*float(radius)*float(radius)* float(height)
    lbl.config(text = "Volume is:"+str(volume))

def surfacearea(): 
    pi = 22/7
    height = txtheight.get(1.0,"end-1c")
    radius = txtradius.get(1.0,"end-1c")
    sur_area = ((2*pi*float(radius)*float(radius))+((2*pi*float(radius)*float(height))))
    lbl.config(text = "SA is:"+str(sur_area))

    
    
txtheight = tk.Text(window,height = 2,width = 20)
txtradius = tk.Text(window,height = 2,width = 20)
txtheight.pack()
txtradius.pack()

b1 = tk.Button(window, text= "Volume", command = volume )
b2 = tk.Button(window, text= "Surface area", command = surfacearea )

b1.pack()
b2.pack()

lbl = tk.Label(window,text="")
lbl.pack()

window.mainloop()