import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
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


        if (a % 2 == 0) { // is even
            //Display
            System.out.println("EVEN");
        } else {
            //Display ODD
            System.out.println("ODD");
        }
    }
}
