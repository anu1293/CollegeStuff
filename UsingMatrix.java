package Fibonacci;

import java.util.Scanner;

public class UsingMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{1,1},{1,0}};
		int f[][]={{1,1},{1,0}};
		//int c[][]=new int[2][1];
		int b=0,c=0,d=0,e=0;
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n-2;i++)
		{
		
			b=f[0][0];
			c=f[1][0];
			d=f[0][1];
			e=f[1][1];
			
			f[0][0]=b*a[0][0]+d*a[1][0];
			f[0][1]=b*a[0][1]+d*a[1][1];
			f[1][0]=c*a[0][0]+e*a[1][0];
			f[1][1]=c*a[0][1]+e*a[1][1];
			
		}
		System.out.println(f[1][0]);
		
		

	}

}
