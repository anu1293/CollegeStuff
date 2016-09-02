package Fibonacci;

import java.util.ArrayList;
import java.util.Scanner;

public class PigeonHole {

	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int power[]=new int[n];
	 
	 for(int i=0;i<n;i++)
		 power[i]=sc.nextInt();
	 
	 int m=sc.nextInt();
	 ArrayList<Integer>list=new ArrayList();
	 int x=0,y=1,flag=1,b=0;
	 list.add(x);
	 list.add(y);
	 while(flag!=0)
	 {  
		 b=(y+x)%m;
		 x=y;
		 y=b;
		 
		if(x==0 && y==1 )
		 break;
		list.add(b);
		 
	 }
	 int size=list.size();
	 int val=divide(power,size,n);
	 System.out.println(list.get(val));
	}
	public static int divide(int[] power,int size,int n)
	{
		int i=0,x=0;
		if(n>1)
		{
		x=(power[i]*10+power[i+1])%size;
		 for(i=2;i<n;i++)
	       x=(x*10+power[i])%size;		
			 
		 return x;
		}
		else{
			return power[i]%size;
		}
		}
		
	}

