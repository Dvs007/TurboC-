package Series;
public class fib
{
	public int f=0,s=1,i;
	public void fibSeries(int n1)
	{
		for(int i = 1;i<=n1;i++)
		{
			System.out.println(f+" ");
			int n=f+s;
			f=s;
			s=n;
		}
	}

}