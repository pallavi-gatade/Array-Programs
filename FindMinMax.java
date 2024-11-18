package arrays;

public class FindMinMax {

	static final int MAX_CHAR = 256;
	public static void findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum element is = " + max);
        System.out.println("Minimum element is = " + min);
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 67, 40};
        findMinMax(arr);
    }
}

