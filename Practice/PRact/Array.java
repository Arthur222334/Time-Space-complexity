package PRact;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {


      /*  int[] apple = new int[5];
        int[] rolls = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] roes; *//*declation of array: this is getting defined in Stack*//*

        roes = new int[3];*//*initilization: object is actually create in heap*//*

        int[ ] arr = new int [23];

        String [] Stirn = new String[5];

        System.out.println(Stirn[3]);*/
        int arr[] = new int[4];
        String array[] = new String[3];
        Scanner in = new Scanner(System.in);
        System.out.println("enter any 5 numbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
