package MaxSubArray;

import java.util.Scanner;

public class Atmost_L {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int l=sc.nextInt();
int sum=0;
for(int i=0;i<n;i++)
{
	sum+=sc.nextInt();
	a[i]=sum;
}
int max=a[0],j=0,i=0,add=0,index=0,x=0;
sum=0;
while(j<n)
{
if(a[j]<0)
{
add=a[j];	index=j;j++; if(j==n)break;

sum=a[j]-add;
if(sum>max)
	max=sum;
j++;
continue;
}
else if(j-index>=l)
{   if(add>=0)
	add=a[j-index];
	sum=a[j]-add;
	if(sum>max)
		max=sum;
i=l-1;
x=0;
while(i>0 && a[j]-a[j-i]>a[j])
{ x=i;
	i--;}
if(x!=0)
{add=a[j-x];
sum=a[j]-add;
index=j-x;}
else
{   add=a[j-1];
	sum=a[j]-a[j-1];
	index=j-1;
}
if(sum>max)
	max=sum;
}
else
{ 
sum=a[j]-add;
if(sum>max)
	max=sum;
}
j++;
}
int k=n-l;
for(;k<n-1;k++)
{
sum=a[n-1]-a[k];
if(sum>max)
	max=sum;
}
System.out.println("max="+max);
	}
}
