package org.datastructures.sorting.algos;
// THis Algo works on shifting the elements towards left the smallest found is shifted to the left
// start at index 1 and pick the elemnt compare it with prev nd if smaller thn shift prev to right nd compare with prev

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] data = fullSort();
		String s =new String("Ashwani");
		
		
		System.out.println(Arrays.toString(data));
	}

public static int[] fullSort() {
		int[] data=new int[] {20,35,-15,54,12};
		for (int firstElement=1;firstElement<data.length;firstElement++) {
			int currentEle=data[firstElement];
			int i;
			i = sort(data, firstElement, currentEle);
			data[i]=currentEle;
		}
		return data;
	}

public static int sort(int[] data, int firstElement, int currentEle) {
		int i;
		for(i=firstElement;i>0 && currentEle<data[i-1];i--) {
			
				data[i]=data[i-1];
			
			
		}
		return i;
	}

}
