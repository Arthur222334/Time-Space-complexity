package PRact;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        // Ask the user for the length of the array
        System.out.println("Enter the length of the array : ");
        int length = in.nextInt();

        // Create an array of integers with the given length
        int[] arr = new int[length];

        // Randomly assign values to the elements of the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

        // Print out the values of the array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
