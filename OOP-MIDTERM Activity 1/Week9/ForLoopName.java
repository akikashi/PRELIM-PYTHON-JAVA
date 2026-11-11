import java.util.Scanner;

public class ForLoopName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        for (int count = 1; count <= 5; count++) {
            System.out.println(name);
        }

        input.close();
    }
}
