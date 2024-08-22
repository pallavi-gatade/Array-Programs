package array.programs;

import java.util.Arrays;

//Write a Java program to find the second largest element in an array.
public class SecondLargestNumber {

	public static void main(String[] args) {

		int[] arrList = { 79, 210, 9999, 14, 3410, 1290, 1000, 880 };

		System.out.println("Input array list : " + Arrays.toString(arrList));

		Arrays.sort(arrList);

		int i = arrList.length - 1;

		while (arrList[i] == arrList[arrList.length - 1]) {
			i--;
		}
		System.out.println("Second largest Number from Array: " + arrList[i]);


	}

}
