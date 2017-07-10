package dsalgo;

import java.util.ArrayList;
import java.lang.Integer;

public class MaxDynSubSum {

	private static void maxDynSum(int a[])
	{
		int max_sum=0,max_sum_sofar=0;
		ArrayList<Integer>  b=new ArrayList<Integer>();
		
		
		for( int i=0;i<a.length;i++)
		{
			max_sum_sofar+=a[i];
			
			if(max_sum < max_sum_sofar)
			{	max_sum = max_sum_sofar;
			    b.add(a[i]);
			    
			}
			if(max_sum_sofar < 0)
			{   max_sum_sofar=0;
			    b.clear();
			}
			   
			
		}
		System.out.println("The value of Max Sub set :"+max_sum);
		System.out.println("Sequence with max yield:"+b);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Kadane’s Algorithm
		int [] a = {8, -9, 19, 11, 2,-14, 1, 5, -3};
		maxDynSum(a);

	}

}
