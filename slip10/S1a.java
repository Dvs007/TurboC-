import java.io.*;
import java.util.*;

public class S1a   
{  
     public static void main(String[] args)
	 {  
        int i,j;
		String ch;
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Enetr string");
			ch = sc.next();
			
			int[] str = new int[ch.length()];
			
			char string[] = ch.toCharArray();
			
			for(i = 0; i <ch.length(); i++) 
			{  
                str[i] = 1;  
                for(j = i+1; j <ch.length(); j++) 
				{  
                if(string[i] == string[j]) 
				{  
                    str[i]++;  
                      
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
        }  
		    for(i = 0; i <str.length; i++)
			{
				if(string[i]!= ' ' && string[i] !='0')
				{
					System.out.println(string[i] + ":" +str[i]);
				}
			} 
		}
		catch(Exception e)
		{
			
		}
	 }
}
		
          
		  
		  
		  
		  
		  
		  
     