package Fibonacci;

import java.util.Scanner;

public class Fibonacci_v1 {
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
 {   int flag=1;
	 int y[][]={{1,0},{0,1}};
	 int p=0,q=0,r=0,s=0;
	 int e=0,f=0,g=0,h=0;
	 while(true)
	 {
		 if(flag==0)
			 break;
		if(power[n-1]%2!=0)
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
		
		
		flag=divide(power,n);
	 }
	 
	 return y[1][0];
 }
 public static int divide(int[] power,int n)
 {    
	int x=0,i=0;
	int flag=0;
	while(i<n)
	{
		power[i]= (power[i]+x*10);
		x=(power[i]%2);
		power[i]=(power[i]/2);
		if(power[i]!=0)
			flag=1;
		i++;
	}
	
//	for(int j=0;j<n;j++)
//		System.out.print(power[j]+" ");
	 return flag;
 }
 
}
