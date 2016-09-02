package Sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
int temp=0,flag=0;
for(int i=0;i<n-1;i++)
{  flag=0;
	for(int j=1;j<= n-i-1;j++)
	{
		if(a[j]<a[j-1])
		{  flag=1;
			temp=a[j];
			a[j]=a[j-1];
			a[j-1]=temp;
		}
	}
	if(flag==0)
		break;
}

for(int i=0;i<n;i++)
System.out.println(a[i]);
	}

}
