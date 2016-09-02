package MaxSubArray;

import java.util.Scanner;

public class MinSubArrayOfSum_S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int s=sc.nextInt();
for(int j=0;j<n;j++)
	a[j]=sc.nextInt();
int i=0,j=0,sum=0,sum1=0,len=n+1,index=0;
while(j<n)
{
sum+=a[j];
if(sum>=s)
{
 while(i<j)
 { 
 if(sum-a[i]>=s)
 {
	 sum=sum-a[i];
	 index=i;
 }
 else
	 break;
  i++;
 }
 if(j-i+1<len)
 len=j-i+1;
 } 
if(sum<0)
	{sum=0;
	i=j+1; /* eg -a[]=-1 -2 -3 2 3, s=5, len=2; if we don't do i=j+1 thn sum=5 but when we begin to calculate min len subarray it will add -1 -2 -3 in the sum(sum=11) and that should not happen.*/ 
	}
j++;
}
System.out.println("len="+len+" sum="+sum);
	}
}
