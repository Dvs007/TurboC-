import java.io.*;

class S1b
{
    static int n;
    public static void main( String args[])
	{
		DataInputStream d = new DataInputStream(System.in);
        try
		{
            System.out.print(" Do you Want to Validate \n1. Mobile Number Press : 1 \n2. PAN Card Press : 2 \nEnter Number : ");
            n = Integer.parseInt(d.readLine());
            switch(n)
			{
                case 1 :
                System.out.print("Enter Mobile Number : ");
                Long number = Long.parseLong(d.readLine());
                    if(number.toString().matches("(0/91)?[7-9][0-9]{9}"))
					{
                        System.out.print("Valid Mobile Number..!"+number+"\n");
                    }
					else
					{
                        throw new invalid_data();
                    }
                break;
                case 2 :
                System.out.print("Enter PAN Number : ");
                String str= d.readLine();
                if(str.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}"))
				{
                    System.out.print("Valid PAN CARD Number..!"+str+"\n");
                }
				else
				{
                    throw new invalid_data();
                }
                break;
                default :
                    throw new invalid_data();
            }
        } 
		catch (invalid_data pc) 
		{
            System.out.println("You Enter Invalid Details...!");
        }
        catch (NumberFormatException e)
		{
            System.out.println("You Enter Invalid Details...!");
        }
        catch(Exception e){}
    }
}
class invalid_data extends Exception{}