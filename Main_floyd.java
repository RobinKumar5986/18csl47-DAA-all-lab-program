//import java.lang.*;
import java.util.Scanner;
class Floyd
{
	int d[][]=new int[10][10];
	public void dis_path(int n, int a[][])
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				d[i][j]=a[i][j];
			}
		}
		for(int k=0;k<n;k++)
		{
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					d[i][j]=Math.min(d[i][j],(d[i][k]+d[k][j]));
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}	
	}
}
public class Main_floyd{

	public static void main(String[] args)
	{
		int n;
		int a[][]=new int[10][10];
		Scanner sobj=new Scanner(System.in);
		Floyd f=new Floyd();
		System.out.println("***** FLOYD'S ALGORITHM *****");
		System.out.println("ENTER THE NUMBER OF NODES:");
		n=sobj.nextInt();
		System.out.println("ENTER THE COST ADJECENCY MATRIX:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				a[i][j]=sobj.nextInt();
		}
		System.out.println("RESULTANT SHORTEST PATH MATRIX IS:");
		f.dis_path(n,a);
		//sobj.close();
	}
}
