package PRact;

public class PractRangeSearcg {
    public static void main(String[] args) {
        int arras[]= {2,3,4,5,6,7,8,9,9};
        System.out.println(arras.length);
        int target = 9;
        int ans = Sercho(arras,5,9,target);
        System.out.println(ans);


    }

    static int Sercho(int[] arras, int start, int end, int target) {
if (arras.length==0){
    return -1;
}
        for (int index = start; index <=end ; index++) {
            int element = arras[index];
            if (element==target){
                return index;
            }
        }
        return -1;
    }
}
