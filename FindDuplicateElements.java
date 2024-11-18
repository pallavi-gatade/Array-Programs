package arrays;

public class FindDuplicateElements {

	public static void main(String[] args) {
		
		int[] arrayInput = {1, 2, 3, 2, 4, 7, 8, 8, 3, 4};
		
		System.out.print("Duplicate Elements Are : ");
		
		for(int i = 0; i < arrayInput.length; i++) {
			
			for(int j = i + 1; j < arrayInput.length; j++) {
				
				if(arrayInput[i] == arrayInput[j]) {
				System.out.print(arrayInput[i] + ", ");
				break;
				}
			}
			
		}

	}

}
