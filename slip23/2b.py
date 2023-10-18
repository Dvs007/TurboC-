import math
class circles:
    def __init__(self,radius):
        self.__radius = radius
        
    def setRadius(self,radius):
        self.__radius = radius
        
    def getRadius(self):
        return self.__radius
    
    def area(self):
        return math.pi * self.__radius ** 2 

    def __add__(self,second_circle):
        return circles(self.__radius + second_circle.__radius)

c1 = circles(5)
c2 = circles(6)
c3 = c1+c2 
print("addition of radius 1 + radius 2:",c3.getRadius()) 
print("area of circle is : ",c3.area()) 
      
        
        