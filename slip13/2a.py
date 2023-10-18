while True:
    try:
        num=int(input("Enter a positive integer: "))
        print("a positive integer")	
        break
    except ValueError :
            print("Not a positive integer")	
    

