from tkinter import *
def Prime():
    n = int(input("Enter number"))
    if(n==1 or n==0 or (n%2==0 and n>2)):
        selection = "Not a prime number"
        label.config(text=selection)
    else:
        for i in range(3,int(n**(1/2)+1)):    
            if(n%i==0):
                selection = "Not a prime number"
                label.config(text=selection)
        
        selection = "Prime number"
        label.config(text=selection) 

def perfect_number():
    n = int(input("Enter number"))  
    sum = 0 
    for x in range(1,n):
        if n%x == 0:
            sum+=x
    if sum==n:
        selection = str(n) + "Perfect number"
        label.config(text=selection)
    else:
        selection = str(n) + "Not a perfect number"
        label.config(text=selection)  

def armstrong():
    n = int(input("Enter number"))
    sum = 0
    temp = n
    while temp > 0:
        digit = temp%10
        sum += digit ** 3
        temp //= 10 
    if sum == n:
        selection = str(n) + "Armstrong number"
        label.config(text=selection)
    else:
        selection = str(n) + "Not a armstrong number"
        label.config(text=selection)    
    
top = Tk()
top.geometry("300x150")
radio = IntVar()
R1 = Radiobutton(top,text="Prime number",variable = radio,value=1,command = Prime)
R1.pack(anchor = W)
R2 = Radiobutton(top,text="Perfect number",variable = radio,value=2,command = perfect_number)
R2.pack(anchor = W)
R3 = Radiobutton(top,text="Armstrong number",variable = radio,value=3,command = armstrong)
R3.pack(anchor = W)
label = Label(top)
label.pack()

top.mainloop()