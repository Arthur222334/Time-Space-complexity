public class Aex {
    public static void main(String[] args) {
//        string methods
        String name = "riyaz bhattarai";
        int value = name.length();
        String lstring = name.toLowerCase();
        String usting = name.toUpperCase();
        System.out.println(usting);
        System.out.println(lstring);
        System.out.println(value);
        System.out.println("the name is : " + name);
        System.out.println(name.substring(0,3));
        System.out.println(name.replace("riyaz","apple"));
        System.out.println(name.equalsIgnoreCase("riyax"));
    }
}
