package MaxSubArray;

import java.util.Scanner;

public class MinimumElementFromSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n-2;i++)
		{
			System.out.println(a[i]>a[i+1]?a[i]>a[i+2]?a[i]:a[i+2]:(a[i+1]>a[i+2]?a[i+1]:a[i+2]));
		}
	}

}
