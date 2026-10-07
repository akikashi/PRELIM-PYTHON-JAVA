import java.util.Scanner;

// Program 2: remove duplicates, second largest, second smallest
public class Program2 {

    private Scanner sc;

    public Program2(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        int[] a = new int[8];
        System.out.println("Enter 8 integers:");
        for (int i = 0; i < 8; i++) {
            a[i] = sc.nextInt();
        }

        // remove duplicates: copy each number only if not already copied
        int[] unique = new int[8];
        int count = 0;
        for (int i = 0; i < 8; i++) {
            boolean found = false;
            for (int j = 0; j < count; j++) {
                if (unique[j] == a[i]) {
                    found = true;
                }
            }
            if (!found) {
                unique[count] = a[i];
                count++;
            }
        }
        System.out.print("Array without duplicates:");
        for (int i = 0; i < count; i++) {
            System.out.print(" " + unique[i]);
        }
        System.out.println();

        if (count < 2) {
            System.out.println("Need at least 2 different numbers.");
            return;
        }

        // second largest and second smallest
        int largest = unique[0], secondLargest = Integer.MIN_VALUE;
        int smallest = unique[0], secondSmallest = Integer.MAX_VALUE;
        for (int i = 1; i < count; i++) {
            int v = unique[i];
            if (v > largest) {
                secondLargest = largest;
                largest = v;
            } else if (v > secondLargest) {
                secondLargest = v;
            }
            if (v < smallest) {
                secondSmallest = smallest;
                smallest = v;
            } else if (v < secondSmallest) {
                secondSmallest = v;
            }
        }
        System.out.println("Second largest element: " + secondLargest);
        System.out.println("Second smallest element: " + secondSmallest);
    }
}
