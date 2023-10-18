import java.io.*;
class S1b
{
    public static void main(String[] args) 
	{
        File file = new File("C:\\Users\\Welcome\\s\\slip8");
        File[] f1 = file.listFiles((d,f)-> f.toLowerCase().endsWith(".txt"));
        for(File f : f1) 
		{
            System.out.println(f.getName());
        }
    }
}