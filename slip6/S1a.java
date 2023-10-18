import java.util.Scanner;

public class S1a 
{
    static int n;
    public static void main(String args[])
	{
        int first,last=0;
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter Number : ");
            n = scan.nextInt();
            if(n!=0){
                last = n % 10;
                first = n;
                    while(n>=10){
                        n = n / 10;
                    }
                    
                first=n;
                System.out.print("Sum of First and Last Number is : " + (first + last));
            }
			else
			{
               throw new NumZero();  
            }
           
        } catch (NumZero nz) {
            System.out.println("Number is Zero");
        }
        catch(Exception e){}
        
    }
    
}
class NumZero extends Exception{}