package Sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int j=0,min=0;
		for(int i=1;i<n;i++)
		{
			j=i-1;
			min=a[i];
			while(j>=0 && min<=a[j])
			{
				a[j+1]=a[j];
				j--;
			}
			j++;
			a[j]=min;
		
		}
		
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}

}
