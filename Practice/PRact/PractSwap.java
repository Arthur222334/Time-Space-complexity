package PRact;

public class PractSwap {
    static void Swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    static void reverse(int[] array, int start, int end) {
        start = 0;
        end = array.length - 1;
        while (start < end) {
            Swap(array,start,end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] apple = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        reverse(apple,0,1);
        Swap(apple, 3, 8);
        for (int num : apple) {
            System.out.print(num + " ");
        }
    }
}
