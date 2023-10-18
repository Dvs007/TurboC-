import java.io.*;

public class S1b{
	public static void main(String[] args)
	{
		FileInputStream instream = null;
		FileOutputStream outstream = null;
		
		try
		{
			File infile = new File("a.txt");
			File outfile = new File("b.txt");
			instream = new FileInputStream(infile);
			outstream = new FileOutputStream(outfile);
			
			InputStreamReader isReader = new InputStreamReader(instream);
			BufferedReader reader = new BufferedReader(isReader);
			StringBuffer sb = new StringBuffer();
			
			String str;
			
			byte[] buffer = new byte[1024];
			
			int length;
			
			while((str = reader.readLine())!=null)
			{
				sb.append(str);
			}
			
			for(int i=0;i<sb.length();i++)
			{
				char c = sb.charAt(i);
				if(!Character.isDigit(c))
				{
					String newFile = String.valueOf(c);
					byte[] out = newFile.getBytes();
					System.out.print(newFile);
					outstream.write(out);
					
				}
			}
			System.out.print('\n');
		}
		catch(IOException e)
		{
		e.printStackTrace();
		}
		
	}
}