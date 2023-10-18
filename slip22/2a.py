class copy:

    str= ""
    n=0
    
    def accept(self):
        self.str = input("Enter any string:")
        self.n = int(input("Enter any number:"))
        
    def display(self):
        print(self.str * self.n)
        
 obj = copy()
 obj.accept()
 obj.display()