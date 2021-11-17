package _00_Intro_to_Sorting_Algorithms;

import java.util.ArrayList;

class _02_SwappingDigits {

    // 1. Complete the method so that the first two elements of the array are
    //    swapped.
    public static int[] swapArrayOfTwo(int[] arr) {
    	int array[] = new int[2];
    	array[1] = arr[0];
    	array[0] = arr[1];
    	for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
    	
		return array;
    }

    // 2. Complete the method so that it sorts the array using a bubble sort.
    //    Iterate through the array and when you find two elements that are out
    //    of order, swap them. Repeat this until the array is in order.
    public static int[] sortIntArray(int[] arr) {
    	int one = 0;
		int two = 0;
		int[] array = arr;
		ArrayList<Integer> Array2 = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			Array2.add(array[i]);
		}

		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length - 1; i++) {
				if (Array2.get(i) > Array2.get(i + 1)) {
					one = Array2.get(i);
					two = Array2.get(i + 1);
					Array2.set(i, two);
					Array2.set(i + 1, one);
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Array2.get(i);
		}
		return arr;
    }

    // 3. Complete the method so that it finds the middle number in the array.
    //    *Hint* it helps to sort it first.
    //    *Double Hint* Use the method you already wrote in step 2 to sort it
    public static int findMiddle(int[] arr) {
    	arr = sortIntArray(arr);
    	int index = (int) ((arr.length / 2) + 0.5);
    	
        return arr[index];
    }
}
