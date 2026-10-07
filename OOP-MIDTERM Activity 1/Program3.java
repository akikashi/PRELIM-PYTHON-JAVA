import java.util.Scanner;

// Program 3: delete an element from a position
// (position counts from 0, matching the sample output)
public class Program3 {

    private Scanner sc;

    public Program3(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        sc.nextLine(); // clear leftover Enter
        System.out.print("Enter Data in Array: ");
        String[] parts = sc.nextLine().trim().split(" +");
        int n = parts.length;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(parts[i]);
        }

        System.out.print("Stored Data in Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();

        System.out.print("Enter poss. of Element to Delete: ");
        int pos = sc.nextInt();
        if (pos < 0 || pos >= n) {
            System.out.println("Invalid position.");
            return;
        }

        // shift everything after pos one step to the left
        for (int i = pos; i < n - 1; i++) {
            a[i] = a[i + 1];
        }

        System.out.print("New data in Array:");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }
}
