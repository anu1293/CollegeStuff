package MaxSubArray;

import java.util.Scanner;

public class MaxDensitySubArray {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int l=sc.nextInt();
		int a[]=new int[n];
		int sum=0;
		for(int k=0;k<n;k++)
		{
			sum+=sc.nextInt();
			a[k]=sum;
			//System.out.println(a[k]);
		}
		int i=0,max=a[l-1]/l,add=0,index=0;
		sum=max;
		int j=l;
    	while(j<n)
	    {
          if(a[i]<0)
          add=a[i]; index=i;
          sum=(a[j]-add)/(j-index+1);
          System.out.println(sum);
          if(sum>max)
        	  max=sum;
          i++;j++;
	    }
    	System.out.println("max="+max);
	}
}
