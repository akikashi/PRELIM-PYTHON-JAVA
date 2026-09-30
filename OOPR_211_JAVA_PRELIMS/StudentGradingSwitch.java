
import java.util.Scanner;

public class StudentGradingSwitch {
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
            int choice = (int) average / 5;

            switch (choice) {
                case 20:
                case 19:
                case 18:
                    System.out.println("A");
                    break;
                case 17:
                case 16:
                    System.out.println("B");
                    break;
                case 15:
                    System.out.println("C");
                    break;
                default:
                    System.out.println("F");
            }

            System.out.println("Do you want to continue : YES / NO");
            answer = input.next();
        } while (answer.equalsIgnoreCase("YES"));

        System.out.println("Program terminated.");
    }
}
