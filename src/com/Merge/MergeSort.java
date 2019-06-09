package com.Merge;

public class MergeSort {

	public static void main(String[] args)
	{
		int[] numbers= {2,4,9,5,10,6,8,1,3,7};
		
		sort(numbers, 0, numbers.length-1);
		
		for(int x=0; x<numbers.length;++x) 
		{
			System.out.print(numbers[x]+" ");
		}
		
		
		
		
		
	}
	
	public static void sort(int[] numbers,int start, int end) 
	{
		if(end<=start) 
		{
			return;
		}
		
		int mid= (start + end) / 2;
		
		sort(numbers,start, mid);
		sort(numbers,mid+1,end);
		merge(numbers,start,mid,end);
	}
	public static void merge(int numbers[], int start, int mid, int end) 
	{
		int[] temporary = new int[numbers.length-1];
		int index = 0;
		int left= start;
		int right = mid+1;
		
		while(left<=mid && right<=end) 
		{
			if(numbers[left]<numbers[right]) 
			{
				temporary[index]= numbers[left];
				++left;
			}
			else 
			{
				temporary[index]= numbers[right];
				++right;
			}
			++index;
		}
		
		// done sorting the Array both left and right sub arrays are sorted
		
		if(left<=mid) 
		{
			while(left<=mid) 
			{
				temporary[index]= numbers[left];
				++left;
				++index;
			}
		}
		else
			if(right<=end)
		  {
			while(right<=end) 
			{
				temporary[index]= numbers[right];
				++right;
				++index;
			}
			
		    }
		
		//copy back into the original array
		for(int i = 0;i<temporary.length;++i)
		{
			numbers[start+1] = temporary[i];
		}
		
	}

	
}
