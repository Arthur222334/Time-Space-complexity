package PRact;

public class SearchInString {
    static boolean Search(String Str, char target) {
        if (Str.isEmpty()){
            return false;
        }
        for (int i = 0; i <Str.length() ; i++) {
            if (target==Str.charAt(i)){
                return true;
            }
        }
        return false;
    }  static boolean Search2(String Str, char target) {
        if (Str.isEmpty()){
            return false;
        }
        for (char ch: Str.toCharArray()){
            if(ch ==target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String name = "Kunal";

        char target = 'u';
        boolean Out = Search2(name, target);
        System.out.println(Out);
    }
}
