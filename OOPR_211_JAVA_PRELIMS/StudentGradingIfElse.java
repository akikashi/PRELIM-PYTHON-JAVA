import java.util.Scanner;

public class StudentGradingIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Java Score:");
            int java = input.nextInt();
            System.out.println("C Score:");
            int c = input.nextInt();
            System.out.println("Database Handling score:");
            int db = input.nextInt();

            double average = (java + c + db) / 3.0;

            if (average >= 90) {
                System.out.println("A");
            } else if (average >= 80) {
                System.out.println("B");
            } else if (average >= 75) {
                System.out.println("C");
            } else {
                System.out.println("F");
            }

            System.out.println("Do you want to continue : YES / NO");
            answer = input.next();
        } while (answer.equalsIgnoreCase("YES"));

        System.out.println("Program terminated.");
    }
}

