package org.orangewest.sort.merge;

import org.orangewest.sort.AbstractSort;

/**
 * @Description 并归排序
 * @author jp
 * @time 2018年3月14日 下午3:31:40
 */
public class MergeSort extends AbstractSort {
	/**
	 * 基本思想:归并（Merge）排序法是将两个（或两个以上）有序表合并成一个新的有序表，即把待排序序列分为若干个子序列，每个子序列是有序的。
	 * 然后再把有序子序列合并为整体有序序列。
	 * 
	 * 归并排序是稳定的排序方法。
	 * 
	 * 归并排序的时间复杂度为O(nlogn)。
	 * 
	 * 速度仅次于快速排序，为稳定排序算法，一般用于对总体无序，但是各子项相对有序的数列。
	 */
	@Override
	public void sort(int[] arr) {
		mergeSort(arr, 0, arr.length - 1);
	}

	private static void mergeSort(int[] a, int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;
			// 对左边进行递归
			mergeSort(a, left, middle);
			// 对右边进行递归
			mergeSort(a, middle + 1, right);
			// 合并
			merge(a, left, middle, right);
		}
	}

	private static void merge(int[] a, int left, int middle, int right) {
		int[] tmpArr = new int[a.length];
		int mid = middle + 1; // 右边的起始位置
		int tmp = left;
		int third = left;
		while (left <= middle && mid <= right) {
			// 从两个数组中选取较小的数放入中间数组
			if (a[left] <= a[mid]) {
				tmpArr[third++] = a[left++];
			} else {
				tmpArr[third++] = a[mid++];
			}
		}
		// 将剩余的部分放入中间数组
		while (left <= middle) {
			tmpArr[third++] = a[left++];
		}
		while (mid <= right) {
			tmpArr[third++] = a[mid++];
		}
		// 将中间数组复制回原数组
		while (tmp <= right) {
			a[tmp] = tmpArr[tmp++];
		}
	}

}
