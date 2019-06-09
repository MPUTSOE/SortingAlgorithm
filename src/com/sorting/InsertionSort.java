package com.sorting;

public class InsertionSort {

	public static void main(String[] args)
	{
		int[] numbers ={23,45,67,1,2,3,4};
		
		for(int first=1; first< numbers.length;++first) 
		{
			int newElement = numbers[first];
			int i;
			for(i=first;i>0 && numbers[i-1]>newElement; --i) 
			{
				numbers[i] = numbers[i-1];
			}
			
			numbers[i] = newElement;
			
		}
		for(int x : numbers) 
		{
		System.out.print(x+" ");	
		}

	}

}
