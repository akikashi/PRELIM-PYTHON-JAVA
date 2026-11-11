import java.util.Scanner;

public class WhileLoopName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        int count = 1;
        while (count <= 5) {
            System.out.println(name);
            count++;
        }

        input.close();
    }
}
