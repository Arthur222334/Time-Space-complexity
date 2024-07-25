public class FatraMatre {
    /*public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("apple");
        sb.insert(0, 's');
        sb.setCharAt(2, 't');
        sb.delete(5, 6);
        for (int i = 0; i < sb.length(); i++) {
            System.out.println(sb.charAt(i));
        }
    }
}*/
    /*Reverse Strings*/
    public static void main(String[] args) {
        StringBuilder sa = new StringBuilder("hello");
        for (int i = 0; i < sa.length() / 2; i++) {
            int front = i;
            int back = sa.length() - 1 - i;
            System.out.println(back);
        }
        sa.reverse();
        System.out.println(sa);

    }
}



