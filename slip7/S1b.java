import java.io.*;
import java.util.*;
public class S1b
{
	public static void main(String args[]) throws IOException
	{
		final List<Double> allAverages = new ArrayList<Double>();
		int pid,iplayed,noplayer,notout,runs,i;
	    double avg=0; avgall = 0;
		String name;
		
		BufferReader br = new BufferReader(new InputStreamReader(System.in));
		System.out.println("Enter how many players you want:");
		noplayer = Integer.parseInt(br.readLine());
		
		CricketPlayer s[] = new CricketPlayer[noplayer];
		
		for(i=0;i<noplayer;i++)
		{
			System.out.println("Enetr pid:");
			pid = Integer.parseInt(br.readLine());
			System.out.println("Enetr name:");
			name = br.readLine();
			System.out.println("Enetr runs:");
			runs = Integer.parseInt(br.readLine());
			System.out.println("Enetr innings played:");
			iplayed = Integer.parseInt(br.readLine());
			System.out.println("Enetr number of times Not out:");
			notout = Integer.parseInt(br.readLine());
			
			s[i] = new CricketPlayer(pid,name,runs,iplayed,notout);
		}
		
		for(i=0;i<noplayer;i++)
		{
			avgall = s[i].average();
			
			System.out.println();
			System.out.println("Average of "+s[i].name+"is:"+avgall);
		}
		allAverages.add(avgall);
		System.out.println("Max Average of is:"+Collection.max(allAverages));
	}
}

class CricketPlayer
{
	int pid,run,notout;
	String name;
	int iplayed;
	CricketPlayer(int pid1,String pname,int run1,int iplayed1,int notout1)throws IOException{
		pid = pid1;
		name= pname;
		run=run1;
		iplayed = iplayed1;
		notout = notout1;
		
	}
	public double average(String name1)
	{
		double avg = 0;
		if(name.equals(name1))
		{
			avg= (double)run/(double)iplayed;
			return avg;
		}
		else
			return 0;
	}
	public double average()
	{
		double avg = 0;
		avg+= (double)run/(double)iplayed;
		return avg;
	}
}

