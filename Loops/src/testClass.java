import java.util.Scanner;

public class testClass {
    public static void main(String[] arg) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scan.nextInt();
        scan.close();
        if (number % 2 == 0) {
            System.out.println("Number divisible by 2 without reminder");
            if (number % 6 == 0) {
                System.out.println("Number divisible by 6 without remainder");
            }
        }
    }
}