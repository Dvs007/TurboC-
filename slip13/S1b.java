import java.util.*;

class S1b {

    public static void main(String args[]){

        String str;

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Username : ");

            str = sc.next();

            System.out.print("\"Hello, " + str.toUpperCase() + ", nice to meet you!\"");

        } catch (Exception e) {}

    }
}