package PRact;

public class LinearSearchPractice {

    static int lino(int[] array, int target) {
        if (array.length == 0) {
            return -1;
        }
        for (int index = 0; index<array.length ; index++) {
            int element = array[index];
            if (element==target){
                return index;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[]sapp = {1, 2, 3, 4, 5, 67, 8, 9, 0, 7, 6, 5, 4, 3, 2, 2, 2, 4, 5, 6, 7};
        int tar = 67;
        int ans = lino(sapp, tar);
        System.out.println(ans);
    }
}
