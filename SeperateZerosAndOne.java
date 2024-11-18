package arrays;

public class SeperateZerosAndOne {

	 public static void main(String[] args) {
		 
		 int[] inputArr = {1, 0, 1, 0, 1, 0, 1, 0, 0};
		 
		 int j = 0;
		 
		 for(int i = 0; i < inputArr.length; i++) {
			 
			 if(inputArr[i] == 0) {
				 inputArr[j++] = inputArr[i];
				 
			 }
		 }
		
		 while(j < inputArr.length) {
			 inputArr[j++] = 1;
		 }
		 
		 for(int k = 0; k < inputArr.length; k++)
			 
			 System.out.print(inputArr[k] + " ");
	 }
	 
}
