import java.util.Scanner;

// Program 1: sum/average of positives, count of negatives, minimum
public class Program1 {

    private Scanner sc;

    public Program1(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        double[] a = new double[10];
        System.out.println("Enter 10 real numbers:");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextDouble();
        }

        // loop 1: sum and average of positive numbers
        double sum = 0;
        int positives = 0;
        for (int i = 0; i < 10; i++) {
            if (a[i] > 0) {
                sum += a[i];
                positives++;
            }
        }
        System.out.println("Sum of positive numbers: " + sum);
        if (positives > 0) {
            System.out.println("Average of positive numbers: " + (sum / positives));
        } else {
            System.out.println("Average of positive numbers: no positive numbers");
        }

        // loop 2: count negative numbers
        int negatives = 0;
        for (int i = 0; i < 10; i++) {
            if (a[i] < 0) {
                negatives++;
            }
        }
        System.out.println("Count of negative numbers: " + negatives);

        // loop 3: minimum value
        double min = a[0];
        for (int i = 1; i < 10; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Minimum value: " + min);
    }
}
