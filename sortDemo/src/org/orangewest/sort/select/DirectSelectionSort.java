package org.orangewest.sort.select;

import org.orangewest.sort.AbstractSort;

/**
 * @Description 直接选择排序
 * @author jp
 * @time 2018年3月14日 下午2:30:00
 */
public class DirectSelectionSort extends AbstractSort {
	/**
	 * 基本思想：在要排序的一组数中，选出最小的一个数与第一个位置的数交换；然后在剩下的数当中再找最小的与第二个位置的数交换，如此循环到倒数第二个数和最后一个数比较为止。
	 * 简单选择排序是不稳定的排序。
	 * 
	 * 时间复杂度：T(n)=O(n2)。
	 */
	@Override
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];
			int n = i; // 最小数的索引
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					n = j;
				}
			}
			arr[n] = arr[i];
			arr[i] = min;
		}
	}

}
