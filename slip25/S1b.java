import java.util.*;
import Series.*;
class S1b
{
	public static void main(String args[])
	{
		int n1,n2,n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many fibonacci series you want");
		n1 = sc.nextInt();
		System.out.println("Enter how many cube series you want");
		n2 = sc.nextInt();
		System.out.println("Enter how many square series you want");
		n3 = sc.nextInt();
		System.out.println("\n-----------Fibonacci series-----------\n\n");
		fib f = new fib();
		f.fibSeries(n1);
		System.out.println("\n-----------Cube series-----------\n\n");
		cubes c = new cubes();
		c.cubeSeries(n2);
		System.out.println("\n-----------Square series-----------\n\n");
		square s = new square();
		s.squareSeries(n3);
	}
	
}