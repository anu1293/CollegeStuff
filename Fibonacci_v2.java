package Fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci_v2 {
	public static void main(String args[])
	{
		int a[][]={{1,1},{1,0}};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int power[]=new int[n];
		for(int i=0;i<n;i++)
		{
			power[i]=sc.nextInt();
		}
		
		int c=calculate(a,power,n);
		System.out.println(c);
		}
	 static int calculate(int[][] a,int[] power,int n)
	 {  
		 int y[][]={{1,0},{0,1}};
		 int p=0,q=0,r=0,s=0;
		 int e=0,f=0,g=0,h=0;
		 ArrayList<Integer>list=divide(power,n);
		 for(int i:list)
		 {
			 
			if(i==1)
			{  
				 p=y[0][0];
				  q=y[0][1];
				  r=y[1][0];
				  s=y[1][1];
				y[0][0]=(p*a[0][0]+q*a[1][0])%100;
				y[0][1]=(p*a[0][1]+q*a[1][1])%100;
				y[1][0]=(r*a[0][0]+s*a[1][0])%100;
				y[1][1]=(r*a[0][1]+s*a[1][1])%100;
				
			}
			e=a[0][0]; f=a[0][1]; g=a[1][0]; h=a[1][1];
			
			a[0][0]=(e*e+f*g)%100;
			a[0][1]=(e*f+f*h)%100;
			a[1][0]=(g*e+h*g)%100;
			a[1][1]=(g*f+h*h)%100;
			
			
			
		 }
		 
		 return y[1][0];
	 }
	 public static ArrayList<Integer> divide(int[] power,int n)
	 {   
		 ArrayList<Integer> list=new ArrayList();
		 int i=0,flag=1,x=0;
	 while(true)
	 { 
		 
		 if(flag==0)
		 break;
		  flag=0;
			while(i<n)
			{
			
			power[i]= (power[i]+x*10);
			x=(power[i]%2);
			power[i]=(power[i]/2);
			if(power[i]!=0)
				flag=1;
			i++;
			
			}
			if(x%2==1)
			{
				list.add(1);
			}
			else
				list.add(0);
			
			i=0;x=0;
		 
	 }
	 
		
		

		 return list;
	 }
	 
}
