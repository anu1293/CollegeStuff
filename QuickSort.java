package Sorting;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		Qsort(a,0,a.length-1);
		
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
	public static void Qsort(int a[],int i,int j)
	{
		if(i<j)
		{
		int q=partition(a,i,j);
		Qsort(a,i,q-1);
		Qsort(a,q+1,j);
	}
	}
	public static int partition(int a[],int p,int r)
	{
		int pivot=a[r];
		int i=p-1,temp=0;
		for(int j=p;j<r;j++)
		{
			if(a[j]<=pivot)
				{
				i++;
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				}
		}
		temp=a[i+1];
		a[i+1]=a[r];
		a[r]=temp;
		return i+1;
	}

}
