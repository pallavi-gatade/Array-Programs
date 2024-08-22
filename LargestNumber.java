package array.programs;

import java.util.Arrays;

public class LargestNumber {

	public static void main(String[] args) {

		int[] arrList = { 79, 210, 9999, 14, 563, 786, 3458, 554, 452, 65, 2190 };

		System.out.println("Input array list : " + Arrays.toString(arrList));

		Arrays.sort(arrList);

		int i = arrList.length - 1;

//		System.out.println(" largest Number from Array: " + arrList[arrList.length - 1]);
		System.out.println(" largest Number from Array: " + arrList[i]);

	}
}
