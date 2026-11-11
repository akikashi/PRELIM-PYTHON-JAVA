import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * OOPR Midterm Lab Activities 1-31 in one file.
 * Compile:  javac MidtermActivities.java
 * Run:      java MidtermActivities
 * Pick an activity number from the menu; enter 0 to exit.
 */
public class MidtermLabActivities {

    // One shared Scanner so no input is lost when moving between activities.
    static final Scanner in = new Scanner(System.in);

    static final String[] TITLES = {
        "Vowel or consonant",
        "Date in words",
        "Temperature (ICE / WATER / STEAM)",
        "Aircraft: military, civilian or bird",
        "Ship class by class ID",
        "Earthquake damage (Richter scale)",
        "Number to words (up to 3000)",
        "Number to Roman numerals (up to 3000)",
        "Tuition fee by mode of payment",
        "Percentile to grade equivalent",
        "Sequence numbers and their squares",
        "Alternating sequence 1, 5, 2, 4, ...",
        "Alternating sequence 5, 1, 4, 2, ...",
        "Factorial",
        "Fibonacci series",
        "Power of a number",
        "Sum of squares from 1 to n",
        "Sum of 1 to n",
        "Reverse a number",
        "Sum of powers (1^1 + 2^2 + ...)",
        "Right-angle triangle of asterisks",
        "Floyd's triangle (1s and 0s)",
        "Pyramid (odd number of asterisks)",
        "Pyramid of repeated numbers",
        "Pyramid of asterisks",
        "Pyramid of increasing numbers",
        "Right-angle triangle of increasing numbers",
        "Right-angle triangle of repeated numbers",
        "Right-angle triangle (1 up to row number)",
        "Diamond",
        "Number pyramid (1 2 1, 1 2 3 2 1, ...)"
    };

    public static void main(String[] args) {
        while (true) {
            System.out.println();
            System.out.println("===== OOPR MIDTERM LAB ACTIVITIES =====");
            for (int i = 0; i < TITLES.length; i++) {
                System.out.printf("%2d. %s%n", i + 1, TITLES[i]);
            }
            System.out.println(" 0. Exit");
            System.out.print("Choose an activity (0-31): ");

            String line = "";
            while (line.isEmpty()) {
                if (!in.hasNextLine()) return;
                line = in.nextLine().trim();   // skips blank lines left over from the last activity
            }

            int choice;
            try {
                choice = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number from 0 to 31.");
                continue;
            }

            if (choice == 0) {
                System.out.println("Exiting.....");
                return;
            }
            if (choice < 1 || choice > 31) {
                System.out.println("Please enter a number from 0 to 31.");
                continue;
            }

            System.out.println();
            System.out.println("--- Activity " + choice + ": " + TITLES[choice - 1] + " ---");
            try {
                runActivity(choice, args);
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Invalid input.");
                if (in.hasNextLine()) in.nextLine();
            }
        }
    }

    static void runActivity(int choice, String[] args) {
        switch (choice) {
            case 1: Activity01.main(args); break;
            case 2: Activity02.main(args); break;
            case 3: Activity03.main(args); break;
            case 4: Activity04.main(args); break;
            case 5: Activity05.main(args); break;
            case 6: Activity06.main(args); break;
            case 7: Activity07.main(args); break;
            case 8: Activity08.main(args); break;
            case 9: Activity09.main(args); break;
            case 10: Activity10.main(args); break;
            case 11: Activity11.main(args); break;
            case 12: Activity12.main(args); break;
            case 13: Activity13.main(args); break;
            case 14: Activity14.main(args); break;
            case 15: Activity15.main(args); break;
            case 16: Activity16.main(args); break;
            case 17: Activity17.main(args); break;
            case 18: Activity18.main(args); break;
            case 19: Activity19.main(args); break;
            case 20: Activity20.main(args); break;
            case 21: Activity21.main(args); break;
            case 22: Activity22.main(args); break;
            case 23: Activity23.main(args); break;
            case 24: Activity24.main(args); break;
            case 25: Activity25.main(args); break;
            case 26: Activity26.main(args); break;
            case 27: Activity27.main(args); break;
            case 28: Activity28.main(args); break;
            case 29: Activity29.main(args); break;
            case 30: Activity30.main(args); break;
            case 31: Activity31.main(args); break;
        }
    }

    // ===== Activity 1: Vowel or consonant =====
    static class Activity01 {
        public static void main(String[] args) {
            System.out.print("Enter a letter: ");
            String line = in.nextLine().trim();
            if (line.isEmpty()) {
                System.out.println("No letter entered.");
                return;
            }
            char c = Character.toUpperCase(line.charAt(0)); // handles capital or small input

            System.out.println("1st Solution (if / else if / else): " + usingIf(c));
            System.out.println("2nd Solution (switch/case): " + usingSwitch(c));
        }

        static String usingIf(char c) {
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                return "VOWEL";
            } else if (c >= 'A' && c <= 'Z') {
                return "CONSONANT";
            } else {
                return "Not a letter";
            }
        }

        static String usingSwitch(char c) {
            switch (c) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    return "VOWEL";
                default:
                    return (c >= 'A' && c <= 'Z') ? "CONSONANT" : "Not a letter";
            }
        }
    }

    // ===== Activity 2: Date in words =====
    static class Activity02 {
        public static void main(String[] args) {
            System.out.print("Enter a date as month day year (e.g. 2 26 1986): ");
            int month = in.nextInt();
            int day = in.nextInt();
            int year = in.nextInt();

            String m1 = usingIf(month);
            String m2 = usingSwitch(month);
            if (m1 == null) {
                System.out.println("Invalid month");
                return;
            }
            System.out.println("1st Solution (if / else if / else): " + m1 + " " + day + ", " + year);
            System.out.println("2nd Solution (switch/case): " + m2 + " " + day + ", " + year);
        }

        static String usingIf(int month) {
            if (month == 1) return "January";
            else if (month == 2) return "February";
            else if (month == 3) return "March";
            else if (month == 4) return "April";
            else if (month == 5) return "May";
            else if (month == 6) return "June";
            else if (month == 7) return "July";
            else if (month == 8) return "August";
            else if (month == 9) return "September";
            else if (month == 10) return "October";
            else if (month == 11) return "November";
            else if (month == 12) return "December";
            else return null;
        }

        static String usingSwitch(int month) {
            switch (month) {
                case 1:  return "January";
                case 2:  return "February";
                case 3:  return "March";
                case 4:  return "April";
                case 5:  return "May";
                case 6:  return "June";
                case 7:  return "July";
                case 8:  return "August";
                case 9:  return "September";
                case 10: return "October";
                case 11: return "November";
                case 12: return "December";
                default: return null;
            }
        }
    }

    // ===== Activity 3: Temperature (ICE / WATER / STEAM) =====
    static class Activity03 {
        public static void main(String[] args) {
            System.out.print("Enter the temperature (temp): ");
            double temp = in.nextDouble();

            if (temp < 0) {
                System.out.println("ICE");
            } else if (temp <= 100) {
                System.out.println("WATER");   // between 0 and 100
            } else {
                System.out.println("STEAM");   // exceeds 100
            }
        }
    }

    // ===== Activity 4: Aircraft: military, civilian or bird =====
    static class Activity04 {
        public static void main(String[] args) {
            System.out.print("Enter the observed speed (km/h): ");
            double speed = in.nextDouble();
            System.out.print("Enter the estimated length (m): ");
            double length = in.nextDouble();

            if (speed < 500) {
                // slower speeds
                System.out.println("It's a bird");
            } else if (speed > 1100 && length > 52) {
                // faster than 1100 km/h and longer than 52 m
                System.out.println("civilian");
            } else {
                // e.g. 500 km/h and 20 m
                System.out.println("military");
            }
        }
    }

    // ===== Activity 5: Ship class by class ID =====
    static class Activity05 {
        public static void main(String[] args) {
            System.out.print("Enter the class ID (B, C, D or F): ");
            String line = in.nextLine().trim();
            if (line.isEmpty()) {
                System.out.println("No class ID entered.");
                return;
            }
            char id = Character.toUpperCase(line.charAt(0)); // B or b, C or c, ...

            System.out.println("1st Solution (if / else if / else): " + usingIf(id));
            System.out.println("2nd Solution (switch/case): " + usingSwitch(id));
        }

        static String usingIf(char id) {
            if (id == 'B') {
                return "Battleship";
            } else if (id == 'C') {
                return "Cruiser";
            } else if (id == 'D') {
                return "Destroyer";
            } else if (id == 'F') {
                return "Frigate";
            } else {
                return "Unknown class ID";
            }
        }

        static String usingSwitch(char id) {
            switch (id) {
                case 'B': return "Battleship";
                case 'C': return "Cruiser";
                case 'D': return "Destroyer";
                case 'F': return "Frigate";
                default:  return "Unknown class ID";
            }
        }
    }

    // ===== Activity 6: Earthquake damage (Richter scale) =====
    static class Activity06 {
        public static void main(String[] args) {
            System.out.print("Enter the Richter scale value: ");
            double n = in.nextDouble();

            if (n < 5.0) {
                System.out.println("Little or no damage");
            } else if (n < 5.5) {          // 5.0 <= n < 5.5
                System.out.println("Some damage");
            } else if (n < 6.5) {          // 5.5 <= n < 6.5
                System.out.println("Serious damage");
            } else if (n < 7.5) {          // 6.5 <= n < 7.5
                System.out.println("Disaster");
            } else {                       // higher
                System.out.println("Catastrophe");
            }
        }
    }

    // ===== Activity 7: Number to words (up to 3000) =====
    static class Activity07 {
        static final String[] ONES = {"", "one", "two", "three", "four", "five", "six", "seven",
                "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                "sixteen", "seventeen", "eighteen", "nineteen"};
        static final String[] TENS = {"", "", "twenty", "thirty", "forty", "fifty", "sixty",
                "seventy", "eighty", "ninety"};

        public static void main(String[] args) {
            System.out.print("Enter a number: ");
            int n = in.nextInt();

            if (n < 0 || n > 3000) {
                System.out.println("Please enter a number from 0 to 3000.");
            } else if (n == 0) {
                System.out.println("zero");
            } else {
                System.out.println(toWords(n));
            }
        }

        static String toWords(int n) {
            StringBuilder sb = new StringBuilder();
            if (n >= 1000) {
                sb.append(ONES[n / 1000]).append(" thousand ");
                n %= 1000;
            }
            if (n >= 100) {
                sb.append(ONES[n / 100]).append(" hundred ");
                n %= 100;
            }
            if (n >= 20) {
                sb.append(TENS[n / 10]).append(' ');
                n %= 10;
            }
            if (n > 0) {
                sb.append(ONES[n]).append(' ');
            }
            return sb.toString().trim();
        }
    }

    // ===== Activity 8: Number to Roman numerals (up to 3000) =====
    static class Activity08 {
        public static void main(String[] args) {
            System.out.print("Enter a number: ");
            int n = in.nextInt();

            if (n < 1 || n > 3000) {
                System.out.println("Please enter a number from 1 to 3000.");
                return;
            }

            int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

            StringBuilder roman = new StringBuilder();
            for (int i = 0; i < values.length; i++) {
                while (n >= values[i]) {
                    roman.append(symbols[i]);
                    n -= values[i];
                }
            }
            System.out.println(roman);
        }
    }

    // ===== Activity 9: Tuition fee by mode of payment =====
    static class Activity09 {
        // Negative = discount, positive = interest.
        static final double CASH = -0.10;
        static final double TWO_INSTALLMENT = 0.05;   // the sample (20,000 -> 21,000) shows +5%.
                                                      // Change to -0.05 if you need the table's "5% discount".
        static final double THREE_INSTALLMENT = 0.10;

        public static void main(String[] args) {
            System.out.print("Enter tuition fee: ");
            double fee = Double.parseDouble(in.nextLine().replace(",", "").trim());
            System.out.println("(Press 1 for Cash, 2 for Two-Installment, 3 for Three-Installment)");
            System.out.print("Enter mode of payment: ");
            int mode = Integer.parseInt(in.nextLine().trim());

            double rate;
            switch (mode) {
                case 1:  rate = CASH;              break;
                case 2:  rate = TWO_INSTALLMENT;   break;
                case 3:  rate = THREE_INSTALLMENT; break;
                default:
                    System.out.println("Invalid mode of payment");
                    return;
            }

            double total = fee + fee * rate;
            System.out.println("Your total tuition fee is: " + new DecimalFormat("#,##0.##").format(total));
        }
    }

    // ===== Activity 10: Percentile to grade equivalent =====
    static class Activity10 {
        public static void main(String[] args) {
            System.out.print("Enter the grade (percentile): ");
            double g = in.nextDouble();

            if (g > 100 || g < 75) {
                System.out.println("Out-of-Range");
            } else if (g >= 98) {
                System.out.println("1.00");
            } else if (g >= 95) {
                System.out.println("1.25");
            } else if (g >= 92) {
                System.out.println("1.50");
            } else if (g >= 89) {
                System.out.println("1.75");
            } else if (g >= 85) {
                System.out.println("2.00");
            } else if (g >= 82) {
                System.out.println("2.25");
            } else if (g >= 80) {
                System.out.println("2.50");
            } else if (g >= 77) {
                System.out.println("2.75");
            } else {
                System.out.println("3.00");   // 75-76
            }
        }
    }

    // ===== Activity 11: Sequence numbers and their squares =====
    static class Activity11 {
        public static void main(String[] args) {
            System.out.println("1st Solution - for loop");
            System.out.println("Sequence nos.\tSquared");
            for (int i = 1; i <= 5; i++) {
                System.out.println(i + "\t\t" + (i * i));
            }

            System.out.println();
            System.out.println("2nd Solution - while loop");
            System.out.println("Sequence nos.\tSquared");
            int j = 1;
            while (j <= 5) {
                System.out.println(j + "\t\t" + (j * j));
                j++;
            }

            System.out.println();
            System.out.println("3rd Solution - do while loop");
            System.out.println("Sequence nos.\tSquared");
            int k = 1;
            do {
                System.out.println(k + "\t\t" + (k * k));
                k++;
            } while (k <= 5);
        }
    }

    // ===== Activity 12: Alternating sequence 1, 5, 2, 4, ... =====
    static class Activity12 {
        public static void main(String[] args) {
            System.out.println("1st Solution (for):      " + usingFor());
            System.out.println("2nd Solution (while):    " + usingWhile());
            System.out.println("3rd Solution (do while): " + usingDoWhile());
        }

        // Each pass prints the rising number i, then the falling number 6 - i.
        static String usingFor() {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= 5; i++) {
                sb.append(i).append(", ").append(6 - i);
                if (i < 5) sb.append(", ");
            }
            return sb.toString();
        }

        static String usingWhile() {
            StringBuilder sb = new StringBuilder();
            int i = 1;
            while (i <= 5) {
                sb.append(i).append(", ").append(6 - i);
                if (i < 5) sb.append(", ");
                i++;
            }
            return sb.toString();
        }

        static String usingDoWhile() {
            StringBuilder sb = new StringBuilder();
            int i = 1;
            do {
                sb.append(i).append(", ").append(6 - i);
                if (i < 5) sb.append(", ");
                i++;
            } while (i <= 5);
            return sb.toString();
        }
    }

    // ===== Activity 13: Alternating sequence 5, 1, 4, 2, ... =====
    static class Activity13 {
        public static void main(String[] args) {
            System.out.println("1st Solution (for):      " + usingFor());
            System.out.println("2nd Solution (while):    " + usingWhile());
            System.out.println("3rd Solution (do while): " + usingDoWhile());
        }

        // Reverse of Activity 12: each pass prints the falling number 6 - i, then the rising number i.
        static String usingFor() {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= 5; i++) {
                sb.append(6 - i).append(", ").append(i);
                if (i < 5) sb.append(", ");
            }
            return sb.toString();
        }

        static String usingWhile() {
            StringBuilder sb = new StringBuilder();
            int i = 1;
            while (i <= 5) {
                sb.append(6 - i).append(", ").append(i);
                if (i < 5) sb.append(", ");
                i++;
            }
            return sb.toString();
        }

        static String usingDoWhile() {
            StringBuilder sb = new StringBuilder();
            int i = 1;
            do {
                sb.append(6 - i).append(", ").append(i);
                if (i < 5) sb.append(", ");
                i++;
            } while (i <= 5);
            return sb.toString();
        }
    }

    // ===== Activity 14: Factorial =====
    static class Activity14 {
        public static void main(String[] args) {
            System.out.print("Enter a no. ");
            int n = in.nextInt();

            if (n < 0 || n > 20) {
                System.out.println("Enter a number from 0 to 20 (larger factorials do not fit in a long).");
                return;
            }

            System.out.println("1st Solution (for):      Factorial value : " + usingFor(n));
            System.out.println("2nd Solution (while):    Factorial value : " + usingWhile(n));
            System.out.println("3rd Solution (do while): Factorial value : " + usingDoWhile(n));

            StringBuilder steps = new StringBuilder();
            if (n == 0) steps.append(1);
            for (int i = 1; i <= n; i++) {
                if (i > 1) steps.append('*');
                steps.append(i);
            }
            System.out.println("( The computation is : " + steps + "=" + usingFor(n) + ")");
        }

        // Counts up with i++ (1 * 2 * 3 * ... * n) instead of counting down.
        static long usingFor(int n) {
            long f = 1;
            for (int i = 1; i <= n; i++) {
                f *= i;
            }
            return f;
        }

        static long usingWhile(int n) {
            long f = 1;
            int i = 1;
            while (i <= n) {
                f *= i;
                i++;
            }
            return f;
        }

        static long usingDoWhile(int n) {
            long f = 1;
            if (n < 1) return f;   // 0! = 1 (a do-while would run once, so guard it)
            int i = 1;
            do {
                f *= i;
                i++;
            } while (i <= n);
            return f;
        }
    }

    // ===== Activity 15: Fibonacci series =====
    static class Activity15 {
        public static void main(String[] args) {
            System.out.print("Enter a no. ");
            int n = in.nextInt();

            if (n < 1 || n > 90) {
                System.out.println("Enter a number from 1 to 90.");
                return;
            }

            System.out.println("1st Solution (for):      Fibonacci series: " + usingFor(n));
            System.out.println("2nd Solution (while):    Fibonacci series: " + usingWhile(n));
            System.out.println("3rd Solution (do while): Fibonacci series: " + usingDoWhile(n));
        }

        static String usingFor(int n) {
            StringBuilder sb = new StringBuilder();
            long a = 1, b = 1;
            for (int i = 1; i <= n; i++) {
                sb.append(a).append(' ');
                long next = a + b;   // current third number = sum of the two previous
                a = b;
                b = next;
            }
            return sb.toString().trim();
        }

        static String usingWhile(int n) {
            StringBuilder sb = new StringBuilder();
            long a = 1, b = 1;
            int i = 1;
            while (i <= n) {
                sb.append(a).append(' ');
                long next = a + b;
                a = b;
                b = next;
                i++;
            }
            return sb.toString().trim();
        }

        static String usingDoWhile(int n) {
            StringBuilder sb = new StringBuilder();
            long a = 1, b = 1;
            int i = 1;
            do {
                sb.append(a).append(' ');
                long next = a + b;
                a = b;
                b = next;
                i++;
            } while (i <= n);
            return sb.toString().trim();
        }
    }

    // ===== Activity 16: Power of a number =====
    static class Activity16 {
        public static void main(String[] args) {
            System.out.print("Enter base no. ");
            long base = in.nextLong();
            System.out.print("Enter exponent no. ");
            int exp = in.nextInt();

            if (exp < 0) {
                System.out.println("Enter an exponent of 0 or more.");
                return;
            }

            try {
                long r1 = usingFor(base, exp);
                long r2 = usingWhile(base, exp);
                long r3 = usingDoWhile(base, exp);
                System.out.println("1st Solution (for):      Power value: " + r1);
                System.out.println("2nd Solution (while):    Power value: " + r2);
                System.out.println("3rd Solution (do while): Power value: " + r3);

                StringBuilder steps = new StringBuilder();
                if (exp == 0) steps.append(1);
                for (int i = 1; i <= exp; i++) {
                    if (i > 1) steps.append(" * ");
                    steps.append(base);
                }
                System.out.println("( The computation is : " + base + "^" + exp + " = " + steps + " = " + r1 + ")");
            } catch (ArithmeticException e) {
                System.out.println("The result is too large to compute.");
            }
        }

        static long usingFor(long base, int exp) {
            long result = 1;
            for (int i = 1; i <= exp; i++) {
                result = Math.multiplyExact(result, base);
            }
            return result;
        }

        static long usingWhile(long base, int exp) {
            long result = 1;
            int i = 1;
            while (i <= exp) {
                result = Math.multiplyExact(result, base);
                i++;
            }
            return result;
        }

        static long usingDoWhile(long base, int exp) {
            long result = 1;
            if (exp == 0) return result;   // anything^0 = 1 (guard, since do-while runs at least once)
            int i = 1;
            do {
                result = Math.multiplyExact(result, base);
                i++;
            } while (i <= exp);
            return result;
        }
    }

    // ===== Activity 17: Sum of squares from 1 to n =====
    static class Activity17 {
        public static void main(String[] args) {
            System.out.print("Enter a number n: ");
            int n = in.nextInt();

            if (n < 1) {
                System.out.println("Enter a number of 1 or more.");
                return;
            }

            System.out.println("1st Solution (for):      " + usingFor(n));
            System.out.println("2nd Solution (while):    " + usingWhile(n));
            System.out.println("3rd Solution (do while): " + usingDoWhile(n));
        }

        static String usingFor(int n) {
            StringBuilder sb = new StringBuilder();
            long sum = 0;
            for (int i = 1; i <= n; i++) {
                if (i > 1) sb.append(" + ");
                sb.append((long) i * i);
                sum += (long) i * i;
            }
            return sb + " = " + sum;
        }

        static String usingWhile(int n) {
            StringBuilder sb = new StringBuilder();
            long sum = 0;
            int i = 1;
            while (i <= n) {
                if (i > 1) sb.append(" + ");
                sb.append((long) i * i);
                sum += (long) i * i;
                i++;
            }
            return sb + " = " + sum;
        }

        static String usingDoWhile(int n) {
            StringBuilder sb = new StringBuilder();
            long sum = 0;
            int i = 1;
            do {
                if (i > 1) sb.append(" + ");
                sb.append((long) i * i);
                sum += (long) i * i;
                i++;
            } while (i <= n);
            return sb + " = " + sum;
        }
    }

    // ===== Activity 18: Sum of 1 to n =====
    static class Activity18 {
        public static void main(String[] args) {
            System.out.print("Enter a number n: ");
            int n = in.nextInt();

            if (n < 1) {
                System.out.println("Enter a number of 1 or more.");
                return;
            }

            System.out.println("1st Solution (for):      " + usingFor(n));
            System.out.println("2nd Solution (while):    " + usingWhile(n));
            System.out.println("3rd Solution (do while): " + usingDoWhile(n));
        }

        static String usingFor(int n) {
            StringBuilder sb = new StringBuilder();
            long sum = 0;
            for (int i = 1; i <= n; i++) {
                if (i > 1) sb.append(" + ");
                sb.append(i);
                sum += i;
            }
            return sb + " = " + sum;
        }

        static String usingWhile(int n) {
            StringBuilder sb = new StringBuilder();
            long sum = 0;
            int i = 1;
            while (i <= n) {
                if (i > 1) sb.append(" + ");
                sb.append(i);
                sum += i;
                i++;
            }
            return sb + " = " + sum;
        }

        static String usingDoWhile(int n) {
            StringBuilder sb = new StringBuilder();
            long sum = 0;
            int i = 1;
            do {
                if (i > 1) sb.append(" + ");
                sb.append(i);
                sum += i;
                i++;
            } while (i <= n);
            return sb + " = " + sum;
        }
    }

    // ===== Activity 19: Reverse a number =====
    static class Activity19 {
        public static void main(String[] args) {
            System.out.print("Enter a number: ");
            long n = in.nextLong();

            if (n < 0) {
                System.out.println("Enter a number of 0 or more.");
                return;
            }

            System.out.println("1st Solution (for):      Reverse number: " + usingFor(n));
            System.out.println("2nd Solution (while):    Reverse number: " + usingWhile(n));
            System.out.println("3rd Solution (do while): Reverse number: " + usingDoWhile(n));
        }

        // Equation: reverse = reverse * 10 + (n % 10), then n = n / 10.
        static long usingFor(long n) {
            long reverse = 0;
            for (; n > 0; n /= 10) {
                reverse = reverse * 10 + n % 10;
            }
            return reverse;
        }

        static long usingWhile(long n) {
            long reverse = 0;
            while (n > 0) {
                reverse = reverse * 10 + n % 10;
                n /= 10;
            }
            return reverse;
        }

        static long usingDoWhile(long n) {
            long reverse = 0;
            do {
                reverse = reverse * 10 + n % 10;
                n /= 10;
            } while (n > 0);
            return reverse;
        }
    }

    // ===== Activity 20: Sum of powers (1^1 + 2^2 + ...) =====
    static class Activity20 {
        public static void main(String[] args) {
            System.out.print("Enter a number n: ");
            int n = in.nextInt();

            if (n < 1 || n > 15) {
                System.out.println("Enter a number from 1 to 15 (larger sums do not fit in a long).");
                return;
            }

            System.out.println("1st Solution (for):      " + usingFor(n));
            System.out.println("2nd Solution (while):    " + usingWhile(n));
            System.out.println("3rd Solution (do while): " + usingDoWhile(n));
        }

        // i raised to the power i
        static long power(int base, int exp) {
            long result = 1;
            for (int i = 0; i < exp; i++) {
                result *= base;
            }
            return result;
        }

        static String usingFor(int n) {
            StringBuilder sb = new StringBuilder();
            long sum = 0;
            for (int i = 1; i <= n; i++) {
                if (i > 1) sb.append(" + ");
                sb.append(power(i, i));
                sum += power(i, i);
            }
            return sb + " = " + sum;
        }

        static String usingWhile(int n) {
            StringBuilder sb = new StringBuilder();
            long sum = 0;
            int i = 1;
            while (i <= n) {
                if (i > 1) sb.append(" + ");
                sb.append(power(i, i));
                sum += power(i, i);
                i++;
            }
            return sb + " = " + sum;
        }

        static String usingDoWhile(int n) {
            StringBuilder sb = new StringBuilder();
            long sum = 0;
            int i = 1;
            do {
                if (i > 1) sb.append(" + ");
                sb.append(power(i, i));
                sum += power(i, i);
                i++;
            } while (i <= n);
            return sb + " = " + sum;
        }
    }

    // ===== Activity 21: Right-angle triangle of asterisks =====
    static class Activity21 {
        public static void main(String[] args) {
            System.out.print("Number of rows : ");
            int n = in.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    // ===== Activity 22: Floyd's triangle (1s and 0s) =====
    static class Activity22 {
        public static void main(String[] args) {
            System.out.print("Number of rows : ");
            int n = in.nextInt();

            // Floyd's triangle of alternating 1s and 0s: every row ends with 1.
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(((i + j) % 2 == 0 ? 1 : 0) + " ");
                }
                System.out.println();
            }
        }
    }

    // ===== Activity 23: Pyramid (odd number of asterisks) =====
    static class Activity23 {
        public static void main(String[] args) {
            System.out.print("Number of rows : ");
            int n = in.nextInt();

            // Row i has (2i - 1) asterisks, so the counts are 1, 3, 5, 7, ...
            for (int i = 1; i <= n; i++) {
                for (int s = 0; s < 2 * (n - i); s++) {
                    System.out.print(' ');
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    // ===== Activity 24: Pyramid of repeated numbers =====
    static class Activity24 {
        public static void main(String[] args) {
            System.out.print("Number of rows : ");
            int n = in.nextInt();

            // Row i shows the number i, repeated i times.
            for (int i = 1; i <= n; i++) {
                for (int s = 0; s < n - i; s++) {
                    System.out.print(' ');
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }

    // ===== Activity 25: Pyramid of asterisks =====
    static class Activity25 {
        public static void main(String[] args) {
            System.out.print("Number of rows : ");
            int n = in.nextInt();

            // Row i has i asterisks.
            for (int i = 1; i <= n; i++) {
                for (int s = 0; s < n - i; s++) {
                    System.out.print(' ');
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    // ===== Activity 26: Pyramid of increasing numbers =====
    static class Activity26 {
        public static void main(String[] args) {
            System.out.print("Number of rows : ");
            int n = in.nextInt();

            int width = String.valueOf(n * (n + 1) / 2).length();   // digits in the largest number
            int num = 1;

            for (int i = 1; i <= n; i++) {
                int lead = (n - i) * (width + 1) / 2;
                for (int s = 0; s < lead; s++) {
                    System.out.print(' ');
                }
                for (int j = 1; j <= i; j++) {
                    System.out.printf("%" + width + "d ", num);
                    num++;
                }
                System.out.println();
            }
        }
    }

    // ===== Activity 27: Right-angle triangle of increasing numbers =====
    static class Activity27 {
        public static void main(String[] args) {
            System.out.print("Number of rows : ");
            int n = in.nextInt();

            int num = 1;   // keeps increasing by 1 across the whole triangle
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num++;
                }
                System.out.println();
            }
        }
    }

    // ===== Activity 28: Right-angle triangle of repeated numbers =====
    static class Activity28 {
        public static void main(String[] args) {
            System.out.print("Number of rows : ");
            int n = in.nextInt();

            // Row i shows the number i, repeated i times.
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }

    // ===== Activity 29: Right-angle triangle (1 up to row number) =====
    static class Activity29 {
        public static void main(String[] args) {
            System.out.print("Number of rows : ");
            int n = in.nextInt();

            // Each row counts from 1 up to the row number.
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }

    // ===== Activity 30: Diamond =====
    static class Activity30 {
        public static void main(String[] args) {
            System.out.print("Number of rows (half of the diamond) : ");
            int n = in.nextInt();

            // Top half: 1, 3, 5, ... asterisks
            for (int i = 1; i <= n; i++) {
                printRow(n, i);
            }
            // Bottom half: back down again, without repeating the widest row
            for (int i = n - 1; i >= 1; i--) {
                printRow(n, i);
            }
        }

        static void printRow(int n, int i) {
            for (int s = 0; s < 2 * (n - i); s++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // ===== Activity 31: Number pyramid (1 2 1, 1 2 3 2 1, ...) =====
    static class Activity31 {
        public static void main(String[] args) {
            System.out.print("Number of rows : ");
            int n = in.nextInt();

            int width = String.valueOf(n).length();   // keeps columns aligned past 9 rows

            for (int i = 1; i <= n; i++) {
                for (int s = 0; s < (n - i) * (width + 1); s++) {
                    System.out.print(' ');
                }
                for (int j = 1; j <= i; j++) {            // 1 2 ... i
                    System.out.printf("%" + width + "d ", j);
                }
                for (int j = i - 1; j >= 1; j--) {        // ... 2 1
                    System.out.printf("%" + width + "d ", j);
                }
                System.out.println();
            }
        }
    }
}
