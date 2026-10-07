import java.util.Scanner;

// Main only shows the menu and calls the class of the chosen program
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String again;

        do {
            System.out.println("\nChoose the program you want to run");
            System.out.println("Program 1");
            System.out.println("Program 2");
            System.out.println("Program 3");
            System.out.println("Program 4");
            System.out.println("Program 5");
            System.out.println("Program 6");
            System.out.println("Program 7");
            System.out.print("Your choice (1-7): ");
            int choice = sc.nextInt();

            if (choice == 1) new Program1(sc).run();
            else if (choice == 2) new Program2(sc).run();
            else if (choice == 3) new Program3(sc).run();
            else if (choice == 4) new Program4(sc).run();
            else if (choice == 5) new Program5().run();
            else if (choice == 6) new Program6().run();
            else if (choice == 7) new Program7(sc).run();
            else System.out.println("Invalid choice.");

            // ask Y or N, keep asking until the answer is Y or N
            do {
                System.out.print("\nDo you want to continue ? Y/N: ");
                again = sc.next();
            } while (!again.equalsIgnoreCase("Y") && !again.equalsIgnoreCase("N"));

        } while (again.equalsIgnoreCase("Y"));

        System.out.println("Goodbye!");
    }
}

