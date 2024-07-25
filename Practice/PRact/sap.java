package PRact;

import java.util.Arrays;

public class sap {
    public static void main(String[] args) {
        int[] arr = {1, 23, 7, 18};

        System.out.println(arr.length);
        System.out.println((maxRange(arr,1,3)));
    }

    /*  static void swap(int[] arr, int index1, int index2) {
              int temp = arr[index1];
          arr[index1] = arr[index2];
          arr[index2] = temp;

      }*/
    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }   static int maxRange(int[] arr,int start,int end) {
        int max = arr[start];
        for (int i = start; i <=end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
