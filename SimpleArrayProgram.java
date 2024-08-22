package array.programs;

public class SimpleArrayProgram {

	public static void main(String[] args) {

		int arr[] = new int[10];

		arr[0] = 20;
		arr[1] = 40;
		arr[2] = 60;
		arr[3] = 70;
		arr[4] = 80;
		arr[5] = 100;
		arr[6] = 120;
		arr[7] = 140;
		arr[8] = 160;
		arr[9] = 180;

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}
	}

}
