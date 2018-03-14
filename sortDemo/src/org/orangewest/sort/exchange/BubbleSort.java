package org.orangewest.sort.exchange;

import org.orangewest.sort.AbstractSort;

/**
 * @Description 冒泡排序
 * @author jp
 * @time 2018年3月14日 下午2:49:15
 */
public class BubbleSort extends AbstractSort {
	/**
	 * 基本思想：在要排序的一组数中，对当前还未排好序的范围内的全部数，自上而下对相邻的两个数依次进行比较和调整，让较大的数往下沉，较小的往上冒。
	 * 即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。
	 * 
	 * 冒泡排序是一种稳定的排序方法。
	 * 
	 * •若文件初状为正序，则一趟起泡就可完成排序，排序码的比较次数为n-1，且没有记录移动，时间复杂度是O(n)
	 * •若文件初态为逆序，则需要n-1趟起泡，每趟进行n-i次排序码的比较，且每次比较都移动三次，比较和移动次数均达到最大值∶O(n2)
	 * •起泡排序平均时间复杂度为O(n2)
	 */
	@Override
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			// 这里-i主要是每遍历一次都把最大的i个数沉到最底下去了，没有必要再替换了
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
