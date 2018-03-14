package org.orangewest.sort.insert;

import org.orangewest.sort.AbstractSort;

/**
 * @Description 直接插入排序
 * @author jp
 * @time 2018年3月14日 上午11:33:53
 */
public class DirectInsertionSort extends AbstractSort {
	/**
	 * 基本思想：每步将一个待排序的记录，按其顺序码大小插入到前面已经排序的字序列的合适位置（从后向前找到合适位置后），直到全部插入排序完为止
	 * 文件初态不同时，直接插入排序所耗费的时间有很大差异。
	 * 若文件初态为正序，则每个待插入的记录只需要比较一次就能够找到合适的位置插入，故算法的时间复杂度为O(n)，这时最好的情况。
	 * 若初态为反序，则第i个待插入记录需要比较i+1次才能找到合适位置插入，故时间复杂度为O(n2)，这时最坏的情况。 直接插入排序的平均时间复杂度为O(n2)
	 */
	@Override
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int j;
			int temp = arr[i];
			for (j = i - 1; j >= 0; j--) {
				if (arr[j] > temp) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}
			}
			arr[j + 1] = temp;
		}
	}

}
