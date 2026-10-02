import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Bufferscan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first word: ");
        String first = br.readLine();           // BufferedReader reads the first word

        Scanner sc = new Scanner(br);           // Scanner reads from the same BufferedReader
        System.out.print("Enter second word: ");
        String second = sc.nextLine();
        System.out.print("Enter third word: ");
        String third = sc.nextLine();

        System.out.println(first + " " + second + " " + third);
    }
}