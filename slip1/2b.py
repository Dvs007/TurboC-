from datetime import date
today = date.today()
def cal_age():
    d = int(e_date.get())
    m = int(e_month.get())
    y = int(e_year.get())
    
    age = today.year-y-((today.month,today.day)<(m,d))
    t1.config(state="normal")
    t1.delete('1.0',tk.END)
    t1.insert(tk.END,age)
    t1.config(state="disabled")
    
import tkinter as tk
window = tk.Tk()
window.geometry("500x500")
window.config(bg="#93F005")
window.resizable(width=False,height=False)
window.title("Age calculator")
l1 = tk.Label(window,text="Age calculator", font=("Arial",20,"bold"),fg="black",bg="#93F005")
l2 = tk.Label(window,text="Enter your birthdate", font=("Arial",12),fg="black",bg="#93F005")
l_date = tk.Label(window, text="Date : ", font=("Arial",12,"bold"),fg="black",bg="#93F005")
l_month = tk.Label(window, text="Month : ", font=("Arial",12,"bold"),fg="black",bg="#93F005")
l_year = tk.Label(window, text="year : ", font=("Arial",12,"bold"),fg="black",bg="#93F005")
e_date = tk.Entry(window,width=10)
e_month = tk.Entry(window,width=10)
e_year = tk.Entry(window,width=10)
b1 = tk.Button(window, text="Calculate age ",font=("Arial",12),command=cal_age)
t1=tk.Text(window,width=10,height=2,state="disabled")
l1.place(x=150,y=5)
l2.place(x=70,y=60)
l_date.place(x=130,y=90)
l_month.place(x=130,y=120)
l_year.place(x=130,y=150)
e_date.place(x=190,y=93)
e_month.place(x=190,y=123)
e_year.place(x=190,y=153)
b1.place(x=150,y=183)
t1.place(x=280,y=180)

window.mainloop()





