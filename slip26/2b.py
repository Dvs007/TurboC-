from tkinter import *
from tkinter import messagebox

def clearAll():
    str1Field.delete(0,END)
    altersField.delete(0,END)
    
def checkError():
    if(str1Field.get()==" "):
        messagebox.showerror("invalid or empty input field")
        clearAll()
        return -1
        
def occurences():
    value = checkError()
    if value == -1:
        return
    else:
        String0 = (str1Field.get())
        newstr=''
        for char in String0:
            if char.isupper():
                char = char.lower()
                newstr+=char
            elif char.islower():
                char = char.upper()
                newstr+=char
            elif char==' ':
                char = char.replace(' ','=')
                newstr+=char
            elif char.isdigit():
                char = char.replace(char,'?')
                newstr+=char
            else:
                newstr+=char
                
        altersField.insert(10,str(newstr))
        
if __name__=="__main__":
    window = Tk()
    window.configure(background="light blue")
    window.title("Helloworld")
    window.geometry("300x300")
    
    Stringin = Label(window,text="User String",bg="#000000")
    str1 = Label(window,text="String",bg="light green")
    str1Field = Entry(window)
    
    result = Button(window,text="Show result", fg="Black",bg="gray",command=occurences)
    alters = Label(window,text="Alters String",bg="light green")
    altersField = Entry(window)
    
    clearAllEntry = Button(window,text="Clear",fg="Black",bg="White",command=clearAll)

Stringin.grid(row=0,column=1)
str1.grid(row=1,column=0)
str1Field.grid(row=1,column=1)
alters.grid(row=2,column=0)
altersField.grid(row=2,column=1)
clearAllEntry.grid(row=3,column=0)
result.grid(row=3,column=1)

window.mainloop()
        