import java.util.*;
import java.util.Scanner;

public class S1b {
    public static void main(String args[]){
        Hashtable h1=new Hashtable<>();
        Enumeration en;
        int i,n,std,val,max=0;
        String nm, cname, str, s=null;
        Scanner dr=new Scanner(System.in);

        try {
            System.out.print("Enter the Now Many Record You Want : ");
            n = dr.nextInt();
            dr.nextLine();
            System.out.print("Enter the City Name & STD Code : ");

            for(i=0; i<n; i++){
                cname = dr.nextLine();
                std = dr.nextInt();
                dr.nextLine();
                h1.put(cname,std);
            }

            System.out.print("Enter city name to search : ");
            nm = dr.nextLine();
            en=h1.keys();

            while(en.hasMoreElements()){
                str=(String)en.nextElement();
                val=(Integer)h1.get(str);
                if(str.equals(nm)){
                    System.out.print("STD Code : " + val);
                }
            }
        } catch (Exception e) {}
    }   
}