package array.programs;

public class ReverseArray {

	public static void main(String[] args) {

		int[] inputList = { 1, 2, 3, 4, 5 };

		System.out.println("Input array: ");

		for (int i = 0; i < inputList.length; i++) {

			System.out.println(inputList[i] + " ");
		}

		System.out.println("Reverse Order Array: ");

		for (int j = inputList.length - 1; j >= 0; j--) {

			System.out.print(inputList[j] + " ");
		}
	}

}
