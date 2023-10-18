
from tkinter import *
import string 
from secrets import choice

UPPERCASE = list(string.ascii_uppercase)
lowercase = list(string.ascii_lowercase)
NUMBER = list(string.digits)
SYMBOLS = ['!','@','#','$','%','^','&','*','(',')','-','_','+','=','{','}','[',']',';','<','>','?','/']
class passwordGenerator:
    def __init__(self):
        self.window = Tk()
        self.window.title("Password generator")
        self.window.geometry("500x300")
        
        self.label_frame = LabelFrame(self.window,text="Enter length of password")
        self.label_frame.pack(pady = 20)
        
        self.length_entry_box = Entry(self.label_frame,width=10)
        self.length_entry_box.pack(padx = 20, pady = 20)
        
        self.err = Label(self.window)
        
        self.password_entry_box = Entry(self.window,text="",width = 50)
        self.password_entry_box.pack(pady = 20)
        
        self.button_frame = Frame(self.window)
        self.button_frame.pack(pady = 20)
        
        pass_generator_btn = Button(self.button_frame,text="Generate password",command = self.generate_ramdom_password)
        pass_generator_btn.grid(row=0,column=0,padx=10)
        
        
        
    def generate_ramdom_password(self):
        self.password_entry_box.delete(0,END)
        try:
            password_length = int(self.length_entry_box.get())
            self.err.destroy()
                
            data = UPPERCASE + lowercase + NUMBER + SYMBOLS
            password =''.join(choice(data)
                              for x in range(password_length))
                                 
            self.password_entry_box.insert(0,password)
            
        except ValueError:
            self.err = Label(self.window,fg = "red",text = "Please enter length of password")
            self.err.place(x=160,y=100)
                
        
passwordGenerator().window.mainloop()





