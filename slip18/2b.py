class Person:
    name=""
    address=""
    
    def accept1(self):
        self.name = input("enter name:")
        self.address = input("enter address")
    
    def display1(self):
        print("name:"+self.name)
        print("address:"+self.address)
        
class Employee(Person):
    staffed_salary=0
    
    def accept2(self):
        self.staffed_salary = int(input("enter salary:"))
        
    
    def display2(self):
        print("salary:"+str(self.staffed_salary))

obj = Employee()
obj.accept1()
obj.accept2()
obj.display1()
obj.display2()
        
