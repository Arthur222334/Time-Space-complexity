package PRact;

public class linerosa {
    public static void main(String[] args) {
        int[] sad = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int ans = sap(sad, 9);
        System.out.println(ans);
    }

    public static int sap(int[] array, int target) {
        if (array.length == 0) {
            return -1;
        }
        for (int element : array) {
            for (int selement : array) {
                if (selement == target) {
                    return element;
                }
            }
        }
        return -2;
    }
}
