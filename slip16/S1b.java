import java.util.*;
class S1b
{  
   static String[] str = new String[5];
   static Scanner sc = new Scanner(System.in);
   static ArrayList<String>list = new ArrayList<String>();
   
   public static void main(String args[])
   {
   for(int i=0;i<str.length;i++)
   {
   System.out.println("Enter name:");
   str[i] = sc.next();
   list.add(str[i]);
   }
   Collections.sort(list);
   System.out.println(list);
   
   }
}