import java.util.Scanner;

public class DoWhileLoopName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        int count = 1;
        do {
            System.out.println(name);
            count++;
        } while (count <= 5);

        input.close();
    }
}
