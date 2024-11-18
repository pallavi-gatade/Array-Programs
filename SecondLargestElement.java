package arrays;

import java.util.Arrays;

public class SecondLargestElement {

	    public int findSecondLargest(int[] arr) {
	    	
	        Arrays.sort(arr);  

	        int largest = arr[arr.length - 1];
	        
//	        for (int i = arr.length - 2; i >= 0; i--) {
//	            if (arr[i] < largest) {
//	                return arr[i];
//	            }
//	        }
	        
//	        int secondLargest = arr[arr.length - 2];
	        return arr[arr.length - 2];
	        
//			return 0;

//	        throw new IllegalArgumentException("There is no second largest element.");
	    }

	    public static void main(String[] args) {
	        int[] arr = {12, 35, 1, 10, 34, 70};
	        
	        SecondLargestElement obj = new SecondLargestElement();
	        
	        int result = obj.findSecondLargest(arr);
	        System.out.println("The second largest element is: " + result);
	    }
	}

