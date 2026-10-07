import java.util.Scanner;

// Program 4: even and odd elements
public class Program4 {

    private Scanner sc;

    public Program4(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.print("Enter Size of Array : ");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter any " + size + " elements in Array: ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Even Elements:");
        for (int i = 0; i < size; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(" " + a[i]);
            }
        }
        System.out.println();

        // odd elements are printed from the end, like the sample (7 5)
        System.out.print("Odd Elements:");
        for (int i = size - 1; i >= 0; i--) {
            if (a[i] % 2 != 0) {
                System.out.print(" " + a[i]);
            }
        }
        System.out.println();
    }
}
