package org.orangewest.sort.insert;

import org.orangewest.sort.AbstractSort;

/**
 * @Description 希尔排序
 * @author jp
 * @time 2018年3月14日 下午1:48:48
 */
public class ShellSort extends AbstractSort {
	/**
	 * 基本思想：先取一个小于n的整数d1作为第一个增量，把文件的全部记录分成d1个组。 所有距离为d1的倍数的记录放在同一个组中。 先在各组内进行直接插入排序；
	 * 然后，取第二个增量d2<d1重复上述的分组和排序，直至所取的增量dt=1(dt<dt-l<…<d2<d1)，即所有记录放在同一组中进行直接插入排序为止。
	 * 该方法实质上是一种分组插入方法。
	 * 
	 * 希尔排序的时间性能优于直接插入排序，原因如下：
	 * 
	 * （1）当文件初态基本有序时直接插入排序所需的比较和移动次数均较少。
	 * （2）当n值较小时，n和n2的差别也较小，即直接插入排序的最好时间复杂度O(n)和最坏时间复杂度0(n2)差别不大。
	 * （3）在希尔排序开始时增量较大，分组较多，每组的记录数目少，故各组内直接插入较快，后来增量di逐渐缩小，分组数逐渐减少，而各组的记录数目逐渐增多，
	 * 但由于已经按di-1作为距离排过序，使文件较接近于有序状态，所以新的一趟排序过程也较快。 因此，希尔排序在效率上较直接插入排序有较大的改进。
	 * 希尔排序的平均时间复杂度为O(nlogn)。
	 */
	@Override
	public void sort(int[] arr) {
		int d = arr.length;
		while (true) {
			d = d / 2;
			for (int x = 0; x < d; x++) {
				for (int i = x + d; i < arr.length; i = i + d) {
					int temp = arr[i];
					int j;
					for (j = i - d; j >= 0 && arr[j] > temp; j = j - d) {
						arr[j + d] = arr[j];
					}
					arr[j + d] = temp;
				}
			}
			if (d == 1) {
				break;
			}
		}
	}

}
