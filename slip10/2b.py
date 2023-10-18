class validity:
    def val(str):
        check = ['()','{}','[]']
        
        while any(i in str for i in check):
        
            for j in check:
            
                str = str.replace(j,'')
                
        return not str      

        
user = input("Enter anything:")

print(user," ","is Valid"

      if validity.val(user) else "is invalid")