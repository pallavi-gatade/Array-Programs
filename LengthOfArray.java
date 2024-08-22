package array.programs;

public class LengthOfArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] int_array = { 1, 2, 3, 4, 5, 6, 7, 8 };
//		Scanner sc = new Scanner(System.in);

		System.out.print("Input array :");

		for (int i = 0; i < int_array.length; i++) {

			System.out.print(int_array[i]);

		}
		System.out.println("");

		System.out.println("Length of Array is:" + int_array.length);
	}
}
