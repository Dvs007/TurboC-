import tkinter as tk

window = tk.Tk()
window.title("List widget")
window.geometry("500x500")

def additem():
    listbox.insert(tk.END,content.get())
    
def delitem():
    listbox.delete(tk.ANCHOR)
    
def pritem():
    for x in listbox.curselection():
        lbl.config(text = listbox.get(x))
    
content = tk.StringVar()
entry = tk.Entry(window,textvariable = content)
entry.pack()

button = tk.Button(window,text="Add item", command = additem)
button.pack()

button_del_sel = tk.Button(window,text="Delete item", command = delitem)
button_del_sel.pack()

button_print_sel = tk.Button(window,text="Print item", command = pritem)
button_print_sel.pack()

lbl = tk.Label(window,text="")
lbl.pack()

listbox = tk.Listbox(window)
listbox.pack()
