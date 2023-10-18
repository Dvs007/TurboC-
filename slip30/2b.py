class country:
    def accept(self):
        self.cname = input("Enter country name")
        self.nationality = input("Enter nationality")
    
    def print(self):    
        print(self.cname)
        
    def print_nationality(self):
        print(self.nationality)
        
        
class state(country):
    def printState(self):
        self.state = input("Enter state:")
        print(self.state)
        
obj = state()
obj.accept()
obj.printState()
obj.print()
obj.print_nationality()
        