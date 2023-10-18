import java.util.*;
 class S1a {
    public static void main(String args[]) 
	{
        Circle c = new Circle();
		Sphere s = new Sphere();
		
		c.accept();
		s.accept();
		c.area();
		s.area();
		c.show();
		s.show();
    }
}
interface Shape
{
	void area();
}
class Circle implements Shape
{
	final float pi= 3.14f;
	float area_of_circle,r;
    Scanner sc = new Scanner(System.in);
	void accept()
	{
		System.out.println("Enter radius of circle");
		r= sc.nextFloat();
	}
	 public void area()
	 {
		 area_of_circle = pi*r*r;
	 }
	 public void show()
	 {
		 System.out.println("area of circle is :"+area_of_circle);
		 
	 }
}
class Sphere implements Shape
{
	final float pi= 3.14f;
	float area_of_sphere,r;
    Scanner sc = new Scanner(System.in);
	void accept()
	{
		System.out.println("Enter radius of sphere");
		r = sc.nextFloat();
	}
	 public void area()
	 {
		 area_of_sphere = 4*pi*r*r;
	 }
	 public void show()
	 {
		 System.out.println("area of sphere is :"+area_of_sphere);
	 }

}

 

