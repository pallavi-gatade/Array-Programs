package array.programs;

public class ExtractEvenOddFromArray {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.println("Even numbers array :");
		for(int value : arr) {
			
			if(value % 2 == 0)
				System.out.print(value + " ");
			
		}
		System.out.println("");
		System.out.println("Odd numbers array :");
		for(int value : arr) {
			
			if(value % 2 != 0)
				System.out.print(value + " ");
			
		}
	}
}
