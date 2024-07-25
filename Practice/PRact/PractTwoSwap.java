package PRact;

public class PractTwoSwap {


    public static void main(String[] args) {
        int[] ball = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Swapo(ball, 3, 6);
        reverso(ball,0,0);
        for (int num : ball) {
            System.out.print(num + " ");
        }
    }

    static void reverso(int[] appy, int start, int end) {
        start = 0;
        end = appy.length - 1;
        while (start < end) {
            Swapo(appy, start, end);
            start++;
            end--;
        }
    }


    static void Swapo(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
