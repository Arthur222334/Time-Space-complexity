package PRact;

public class Linera {
    public static void main(String[] args) {
        int[] arr = {23, 45, 1, 0, 2, 8, 19, -11, 25};
        int target = 19;
        int ans = LinearSearcg2(arr, target);
        System.out.println(ans);
    }

    //return element
    static int LinearSearcg2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int element : arr) {
            ///check element for
            if (element == target) {
                return element;
            }
    }
        return Integer.MAX_VALUE;
    }
}
