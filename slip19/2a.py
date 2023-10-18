from tkinter import *
window = Tk()
window.title("Multiplication table")
def multiply():
    n=int(entry.get())
    str1 = "Table of "+str(n)+"\n-------------------\n"
    for x in range(1,11):
        str1 = str1 + " " +str(n)+"x"+str(x)+"="+str(n*x)+"\n"
    output_lbl.config(text=str1,justify=LEFT)    
lbl = Label(text="Enter number",font=('arial',12))
output_lbl=Label(font=('arial',12))
entry=Entry(font=('arial',12),width=5)
btn=Button(text="Click to Multiply",font=('arial',12),command=multiply)
lbl.grid(row=0,column=0,padx=10,pady=10)
entry.grid(row=0,column=1,padx=10,pady=10,ipady=10)
btn.grid(row=0,column=2,padx=10,pady=10)
output_lbl.grid(row=1,column=0,columnspan=3,padx=10,pady=10)

window.mainloop()