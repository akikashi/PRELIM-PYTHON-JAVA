// Program 5: pattern
//   *
//   *A*
//   *A*A*
//   *A*A*A*
public class Program5 {

    public void run() {
        for (int row = 1; row <= 4; row++) {
            System.out.print("*");
            for (int j = 1; j < row; j++) {
                System.out.print("A*");
            }
            System.out.println();
        }
    }
}
