package org.orangewest.sort.insert;

import org.orangewest.sort.AbstractSort;

/**
 * @Description 二分插入排序
 * @author jp
 * @time 2018年3月14日 下午1:18:10
 */
public class BinaryInsertionSort extends AbstractSort {
	/**
	 * 基本思想：二分法插入排序的思想和直接插入一样，只是找合适的插入位置的方式不同，这里是按二分法找到合适的位置，可以减少比较的次数
	 * 二分插入排序的比较次数与待排序记录的初始状态无关，仅依赖于记录的个数。 当n较大时，比直接插入排序的最大比较次数少得多。
	 * 但大于直接插入排序的最小比较次数。 算法的移动次数与直接插入排序算法的相同，最坏的情况为n2/2，最好的情况为n，平均移动次数为O(n2)。
	 */
	@Override
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int left = 0;
			int right = i - 1;
			int mid = 0;
			// 二分法找到插入的位置
			while (left <= right) {
				mid = (left + right) / 2;
				if (temp < arr[mid]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}
			// 找到插入的位置，依次把元素往后移
			for (int j = i - 1; j >= left; j--) {
				arr[j + 1] = arr[j];
			}
			// 在插入位置插入元素
			if (left != i) {
				arr[left] = temp;
			}
		}
	}

}
