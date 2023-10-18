import java.util.*;

public class S1b
{
    public static void main(String args[])
	{
         Cylinder c = new Cylinder();
		 Cone c1 = new Cone();
		 
		 c.accept();
		 c1.accept();
		 c.area();
		 c1.volume();
		 c.area();
		 c1.volume();
		 
    }
}
 
abstract class Shape
{
    final float pi = 3.14f;
	Scanner s = new Scanner(System.in);
    abstract void area();
    abstract void volume();
}
class Cylinder extends Shape
{
	float a,v,r,h;
    void accept()
	{
      System.out.println("Enter Radius and Height of cylinder");
	  r = s.nextFloat();
	  h = s.nextFloat();
    }
    void area()
	{
		a = (2*super.pi*r*h) + (2*super.pi*r*r);
		System.out.println("area of cylinder is : "+a);
	}
	void volume()
	{
		v = super.pi*r*r*h;
		System.out.println("Volume of cylinder is :"+v);
	}
}
class Cone extends Shape
{
    float a,v,r,h;
    void accept()
	{
      System.out.println("Enter Radius and Height of cone");
	  r = s.nextFloat();
	  h = s.nextFloat();
    }
    void area()
	{
		a = super.pi*r*(r+(float)Math.sqrt(h*h+r*r));
		System.out.println("area of cone is : "+a);
	}
	void volume()
	{
		v = (super.pi*r*r*(h/3));
		System.out.println("Volume of cone is :"+v);
	}
}

