package array.programs;

public class SumOfArrayElements {
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int sum = 0;

//		for (int i : my_array)
		for (int i = 0; i < array.length; i++)
//	            sum += i;
			sum = sum + array[i];
		System.out.println("The sum is " + sum);
	}
}
