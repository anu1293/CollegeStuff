package MaxAndMin;

import java.util.Scanner;
/* Finding sum of 2 numbers in an Array which is equal to x */
/* AND Finding sum of 2 numbers in an Array which is equal to a[k] */
public class SumOf2Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		//int x=sc.nextInt();
		int x=a[0];
		Qsort(a,0,n-1);
	int i=0,j=n-1,sum=0;
  if(n>1){  while(i<=j)
	{
    	sum=a[i]+a[j];
		if(sum==x)
		{System.out.println(a[i]+" "+a[j]);
			break;
			}
			else if(sum<x)
			i++;
		else
			j--;
	}
  }
  else
  {
	  if(a[0]==x)
		  System.out.println(a[0]);
	  else
		  i++;	 
  }
    if(i>j)
    	System.out.println("no such elements present");


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
