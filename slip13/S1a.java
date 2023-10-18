
import java.util.*;

class S1a
{

    public static void main(String args[])
	{
	
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter How Many Element You Want = ");
		
        int n = sc.nextInt();
		
		ArrayList list = new ArrayList();
		
		System.out.println("Enter elements of array list ");
		
		for(int i = 0; i < n; i++)
		{
		   String ele = sc.next();
		   list.add(ele);
		}
		
		System.out.println("Original list"+list);
		Collections.reverse(list);
		System.out.println("Reversed list"+list);
		
}
}
