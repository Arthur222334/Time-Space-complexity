package PRact;

public class SearchInRange {
    public static void main(String[] args) {

        int apple[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int target = 7;
        int app=SearcRange(apple,target,3,9);
        System.out.println(app);


    }

    static int SearcRange(int[] array,int target, int start, int end) {
        if (array.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element = array[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}


