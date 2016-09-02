package MaxSubArray;

import java.util.Scanner;

public class UsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		 a[i]=sc.nextInt();
	  
	int max=MaxSubArray(a,0,n-1);	
	System.out.println(max);
	}
public static int MaxSubArray(int[] a,int li,int ui)
{
	if(li==ui)
		return a[li];
	
	int mid=(ui-li)/2+li;
	int leftSubArray=MaxSubArray(a,li,mid);
	int RightSubArray=MaxSubArray(a, mid+1, ui);
	int leftSum=a[mid],rightSum=a[mid+1],sum=0;
	for(int i=mid;i>=li;i--)
	{
		sum+=a[i];
		if(sum>leftSum)
			leftSum=sum;
	}
	
	sum=0;
	
	for(int i=mid+1;i<=ui;i++)
	{
		sum+=a[i];
		if(sum>rightSum)
			rightSum=sum;
	}
	
	sum=leftSum+rightSum;
	if(sum>0)
	{
		 if(RightSubArray>=leftSubArray && RightSubArray>=sum)
			return RightSubArray;
		else if(sum<=leftSubArray && leftSubArray>=RightSubArray)
			return leftSubArray;
		else
		return sum;
	}
	else
	{
		sum=a[li];
		for(int i=li;i<=ui;i++)
		{
			if(sum<a[i])
				sum=a[i];
		}
		return sum;
	}
}
}
