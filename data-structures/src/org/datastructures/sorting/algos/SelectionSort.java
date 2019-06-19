package org.datastructures.sorting.algos;

import java.util.Arrays;
//This algorithm works by selecting the first element as the heighest nd thn compares it with other element
// finally the biggest element in every iteration is put at the end  iteration index nd next loop runs till n-1
public class SelectionSort {

	public static void main(String[] args) {
		int[] data=new int[] {20,35,-15,54,12};
		int lastElement;
		
		for(lastElement=data.length-1;lastElement>0;lastElement--) {
			int biggestElemnt=0;
			for(int i=0;i<=lastElement;i++) {
				if(data[biggestElemnt]<data[i]) {
					biggestElemnt=i;
				}
			}
			swap(data,biggestElemnt,lastElement);
		}
		System.out.println(Arrays.toString(data));
	}
	public static void swap(int[] data,int i,int j) {
		data[i]=data[i]+data[j];
		data[j]=data[i]-data[j];
		data[i]=data[i]-data[j];
		 
	}
}
