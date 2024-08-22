package array.programs;

import java.util.Arrays;

public class NumericOrStringArray {
	public static void main(String[] args) {

		int[] array1 = { 9, 343, 56, 21, 766, 87, 45, 767, 1211, 780, 32, 55 };

		String[] array2 = { "Maths", "Physics", "Biology", "Computer Science", "English", "Chemitry" };

		System.out.println("Input numeric array : " + Arrays.toString(array1));

		Arrays.sort(array1);

		System.out.println("Sorted numeric array : " + Arrays.toString(array1));

		System.out.println("Input string array : " + Arrays.toString(array2));

		Arrays.sort(array2);

		System.out.println("Sorted string array : " + Arrays.toString(array2));
	}
}
