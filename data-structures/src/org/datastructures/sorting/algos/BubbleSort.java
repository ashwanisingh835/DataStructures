package org.datastructures.sorting.algos;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		//int[] data=new int[10];
		int[] data =new int[] {20,15,5,-54,12};
		//This algorithm works on swapping two elements and the last element is the largest.
		//In next iteration iterate till the n-1
		int lastElement=0;
		for(lastElement=data.length-1;lastElement>0;lastElement--) {
			for(int i=0;i<lastElement;i++) {
				if(data[i]>data[i+1]) {
					swap(data,i,i+1);
				}
			}
		}
		System.out.println(Arrays.toString(data));
	}

	public static void swap(int[] data,int i,int j) {
		data[i]=data[i]+data[j];
		data[j]=data[i]-data[j];
		data[i]=data[i]-data[j];
		 
	}
}
