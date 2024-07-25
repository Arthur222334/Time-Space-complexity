package PRact;

public class Freeting {
    public static void main(String[] args) {
        String message = Greeting("ball","cat");
        System.out.println(message);
        String apple = MYTeeth();
    }

    private static String MYTeeth() {
        return "";
    }

    static String Greeting(String s1,String S2) {

        String geeting = s1 + " " +S2;
        return geeting;
    }
}

