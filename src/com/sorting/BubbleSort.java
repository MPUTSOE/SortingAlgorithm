package com.sorting;

public class BubbleSort {

	public static void main(String[] args) 
	{
	 int [] numbers = {2,1,3,10,4,5,6,8,7,9};
	 
	 for(int last = numbers.length-1; last>0; --last) 
	 {
		 for(int i = 0; i<last; ++i ) 
		 {
			 if(numbers[i]>numbers[i+1]) 
			 {
				 swap(numbers,i,i+1);
			 }
			 
		 }
		 
	 }
	 for(int x : numbers)
	 {
		 System.out.print(x+" ");
	 }
	 

	}
	public static void swap(int[]numbers, int a, int b) 
	{
		int temp;
		
		temp = numbers[a];
		numbers[a] = numbers[b];
		numbers[b] = temp;
	}

}
