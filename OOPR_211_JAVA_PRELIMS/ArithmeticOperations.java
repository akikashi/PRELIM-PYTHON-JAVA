import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = input.nextInt();
        System.out.print("Enter y: ");
        int y = input.nextInt();
        double result = 0.0;

        System.out.println("Variable values:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("result = " + result);

        System.out.println("Arithmetic Operation:");

        result = x + y;
        System.out.println("Addition: x + y = " + result);

        result = x - y;
        System.out.println("Subtraction: x - y = " + result);

        result = x * y;
        System.out.println("Multiplication: x * y = " + result);

        result = x / y;
        System.out.println("Division: x / y = " + result);

        result = x % y;
        System.out.println("Modulus: x % y = " + result);

        result = x;
        result++;
        System.out.println("Increment: x++ = " + result);

        result = x;
        result--;
        System.out.println("Decrement: x-- = " + result);
    }
}
