import java.util.Scanner;

public class MustBeEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number!");
        int x = scanner.nextInt();
        if (x == 1) {
            System.out.println("ITS ONE!");
        }
        else // x must be even
        {
            assert (x % 2 == 0);
        }
    }
}
