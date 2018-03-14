package org.orangewest.sort;

import org.orangewest.sort.exchange.BubbleSort;
import org.orangewest.sort.exchange.QuickSort;
import org.orangewest.sort.insert.BinaryInsertionSort;
import org.orangewest.sort.insert.DirectInsertionSort;
import org.orangewest.sort.insert.ShellSort;
import org.orangewest.sort.select.DirectSelectionSort;
import org.orangewest.sort.select.HeapSort;

public class Test {
	public static void main(String[] args) {
		System.out.println("----------直接插入排序开始--------");
		new DirectInsertionSort().star();
		System.out.println();
		System.out.println("----------直接插入排序结束--------");
		System.out.println("----------二分插入排序开始--------");
		new BinaryInsertionSort().star();
		System.out.println();
		System.out.println("----------二分插入排序结束--------");
		System.out.println("----------希尔排序开始--------");
		new ShellSort().star();
		System.out.println();
		System.out.println("----------希尔排序结束--------");
		System.out.println("----------直接选择排序开始--------");
		new DirectSelectionSort().star();
		System.out.println();
		System.out.println("----------直接选择排序结束--------");
		System.out.println("----------堆排序开始--------");
		new HeapSort().star();
		System.out.println();
		System.out.println("----------堆排序结束--------");
		System.out.println("----------冒泡排序开始--------");
		new BubbleSort().star();
		System.out.println();
		System.out.println("----------冒泡排序结束--------");
		System.out.println("----------快速排序开始--------");
		new QuickSort().star();
		System.out.println();
		System.out.println("----------快速排序结束--------");
	}
}
