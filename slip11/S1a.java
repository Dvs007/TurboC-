import java.io.*;
import java.util.*;

public class S1a {
    public static void main(String args[])
	{
        int a,b,n;

        try 
		{
			System.out.println("Enter 1 : Additon" + '\n' 
			+ "Enter 2 : Substraction" + '\n' 
			+ "Enter 3 : Multiplication" + '\n' + "Enter 4 : Division");
            Scanner sc = new Scanner(System.in);
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            System.out.print("Enter Number : ");
            n = sc.nextInt();
            switch(n)
			{
                case 1:  
                System.out.println(a + " + " + b + " = " + (a+b));
                break;
                case 2:  
                System.out.println(a + " - " + b + " = " + (a-b));
                break;
                case 3:  
                System.out.println(a + " * " + b + " = " + (a*b));
                break;
                case 4:  
                System.out.println(a + " / " + b + " = " + (a/b));
                break;
				default:
				System.out.println("invalid choice ");
				
            }
        }
		catch (Exception e) 
		{}
    }
}
