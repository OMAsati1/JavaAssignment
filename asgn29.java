package Assgn;

import java.util.ArrayList;

public class asgn29 {
    public static void main(String[] args) {
        // Sample array
        int[] array = {2, 3, 5, 7, 2, 8, 5, 9, 3, 6, 5, 3};

        // Call the method to find duplicates and their frequency
        findDuplicatesWithFrequency(array);
    }

    public static void findDuplicatesWithFrequency(int[] array) {
        // ArrayList to store the elements we've already checked
        ArrayList<Integer> checkedElements = new ArrayList<>();

        System.out.println("Duplicate elements and their frequency:");

        // Loop through the array to find duplicates
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            if (!checkedElements.contains(array[i])) { // Only check if not already counted
                // Count the frequency of array[i]
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                    }
                }
                // If the frequency is greater than 1, it's a duplicate
                if (count > 1) {
                    System.out.println("Element: " + array[i] + ", Frequency: " + count);
                }
                // Add the element to the checkedElements list to avoid counting again
                checkedElements.add(array[i]);
            }
        }
    }
}
