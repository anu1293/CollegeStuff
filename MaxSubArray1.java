package MaxSubArray;
/*Sub Array having maximum sum of elements of the array*/
import java.util.Scanner;

public class MaxSubArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{			
		    a[i]=sc.nextInt();
		}   
		
		sum=a[0];
		int max=sum;
		for(int j=1;j<n;j++)
		{
			sum+=a[j];
			if(sum>max)
				max=sum;
			if(sum<=0)
			sum=0;
				
		}
		
		System.out.println(max);
	
		
	}

}
