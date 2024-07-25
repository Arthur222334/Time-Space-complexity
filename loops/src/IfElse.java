import java.util.Scanner;

public class IfElse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of math: ");
        int math = sc.nextInt();

        System.out.println("Enter the marks of science: ");
        int science = sc.nextInt();

        System.out.println("Enter the marks of social: ");
        int social = sc.nextInt();

        // Calculate the total marks
        int totalMarks = math + science + social;

        // Calculate the percentage
        double percentage = (double) totalMarks / 300 * 100; // Use casting for accurate division

        System.out.println("The total marks are: " + totalMarks);
        System.out.println("The percentage is: " + percentage + "%");

        if (percentage >= 40) {
            System.out.println("Congratulations! You passed the exam.");
        } else {
            System.out.println("Unfortunately, you failed the exam. Please try again.");
        }
    }
}
