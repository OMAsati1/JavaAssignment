package Assgn.first;

import java.util.Arrays;
import java.util.Scanner;

public class asgn22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        double[] numbers = new double[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Sort the array
        Arrays.sort(numbers);

        double median;
        if (n % 2 == 0) {
            // Even number of elements
            int mid1 = n / 2 - 1;
            int mid2 = n / 2;
            median = (numbers[mid1] + numbers[mid2]) / 2.0;
        } else {
            // Odd number of elements
            int mid = n / 2;
            median = numbers[mid];
        }

        System.out.println("Median: " + median);

        scanner.close();
    }
}

