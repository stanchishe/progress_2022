import java.util.Scanner;

public class ifNoElse {
    public static void main(String... args) {
        //Init a
        int a;

        if (args.length < 1) {
            // creates an object of Scanner
            Scanner input = new Scanner(System.in);
            //Get a from input
            a = input.nextInt();
            // closes the scanner
            input.close();
        } else {
            //Read a from args
            a = Integer.parseInt(args[0]);
        }

        if (a < 0) {
            System.out.println("Negative");
        }
    }
}
