package PRact;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDarrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr2D = new int[3][3];
        System.out.print("enter the number of rows and column : ");
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col] = scanner.nextInt();
            }
        }
        System.out.println("the multidimensinoal array are  : ");
        for (int[] ints : arr2D) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
