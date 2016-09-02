package MaxAndMin;

import java.util.Scanner;

/*Finding max and min in an array in O(n) time*/
public class MaxAndMin1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int i=0,max=0,min=0;
		if(n%2==0)
		{   i=2;
			if(a[0]>a[1])
			{	 max=a[0];
			 min=a[1];
			}
			else
			{
				 max=a[1];
				 min=a[0];
				
			}
		}
		else
		{
			 max=a[0];
			 min=a[0];
		    i=1;
		}
		
		for(;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				if(max<a[i])
					max=a[i];
				if(min>a[i+1])
					min=a[i+1];
			}
			else
			{
				if(max<a[i+1])
					max=a[i+1];
				if(min>a[i])
					min=a[i];
			}
		}
		
		System.out.println("max= "+max+"  min= "+min);
		
		
		
	
	}
		
		

	}


