

public class Tenth {
    public static void main(String[] args) {
   int n = 45;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
      /*  int n =9 ;
        int count =0;
        while (n>0){
            if ((n&1)==1){
                count++;
            }
            n=n>>1;
            System.out.println(count);
        }*/
    }

    private static int setBits(int n) {
        int count =0;
        while (n>0){
            count++;
            n-= (n&-n);
        }
        return count;
    }
}
