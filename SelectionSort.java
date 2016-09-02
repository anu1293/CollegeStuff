package Sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		int max=0,index=0;
		for(int i=n-1;i>=0;i--)
		{
			max=a[0];
			index=0;
			for(int j=1;j<=i;j++)
			{ 
				if(a[j]>max)
				{
					max=a[j];
					index=j;
				}
			}
			a[index]=a[i];
			a[i]=max;
			
		}
		
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}

}
