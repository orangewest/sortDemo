package org.orangewest.sort.radix;

import java.util.ArrayList;
import java.util.List;

import org.orangewest.sort.AbstractSort;

/**
 * @Description 基数排序
 * @author jp
 * @time 2018年3月14日 下午3:45:49
 */
public class RadixSort extends AbstractSort {

	/**
	 * 基本思想：将所有待比较数值（正整数）统一为同样的数位长度，数位较短的数前面补零。然后，从最低位开始，依次进行一次排序。
	 * 这样从最低位排序一直到最高位排序完成以后,数列就变成一个有序序列。
	 * 
	 * 基数排序是稳定的排序算法。
	 * 
	 * 基数排序的时间复杂度为O(d(n+r)),d为位数，r为基数。
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void sort(int[] arr) {
		// 找到最大数，确定要排序几趟
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		// 判断位数
		int times = 0;
		while (max > 0) {
			max = max / 10;
			times++;
		}
		// 建立十个队列
		List<ArrayList> queue = new ArrayList<ArrayList>();
		for (int i = 0; i < 10; i++) {
			ArrayList queue1 = new ArrayList();
			queue.add(queue1);
		}
		// 进行times次分配和收集
		for (int i = 0; i < times; i++) {
			// 分配
			for (int j = 0; j < arr.length; j++) {
				int x = arr[j] % (int) Math.pow(10, i + 1) / (int) Math.pow(10, i);
				ArrayList queue2 = queue.get(x);
				queue2.add(arr[j]);
				queue.set(x, queue2);
			}
			// 收集
			int count = 0;
			for (int j = 0; j < 10; j++) {
				while (queue.get(j).size() > 0) {
					ArrayList<Integer> queue3 = queue.get(j);
					arr[count] = queue3.get(0);
					queue3.remove(0);
					count++;
				}
			}
		}
	}

}
