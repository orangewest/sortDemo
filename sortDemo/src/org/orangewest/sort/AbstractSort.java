package org.orangewest.sort;

public abstract class AbstractSort {
	public void star() {
		int[] arr = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
		System.out.println("排序之前：");
		print(arr);
		sort(arr);
		System.out.println("\n" + "排序之后：");
		print(arr);
	}

	public abstract void sort(int[] arr);

	private void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
