

q = []
def display():
    print(q)
    
def Enqueue():
    element = input("Enter the elements")   
    q.append(element)
    print(element,"added to queue")

def dequeue():
    if not q:
        print("Queue is empty")
    else:
        ele = q.pop(0) 
        print(ele,"is removed from queue")        
    
def Menu():
    size = int(input("Enter size of queue: "))
	
    while True:
        choice = int(input("Select an option : \n1.add\n2.delete\n3.display\n4.quit\n"))
		
        if choice == 1 :
            if len(q) == size :
                print("Queue is full") 
            else:
                Enqueue()
        elif choice == 2 :
            dequeue()  
        elif choice == 3 :
            display() 
        elif choice == 4 :
            break  
        else:
            print("Invalid option")   

Menu()        
                 
        