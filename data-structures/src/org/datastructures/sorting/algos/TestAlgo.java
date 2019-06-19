package org.datastructures.sorting.algos;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestAlgo {

	
	@Test
	public void sortingTest() {
		int[] arr=InsertionSort.fullSort();
		assertArrayEquals(new int[]{-15, 12, 20, 35, 54}, arr);
	}
}
