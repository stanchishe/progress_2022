import java.util.Scanner;

public class Neil {

    public static void main(String[] args) {

        //Init a
        int number;

        if (args.length < 1) {
            // creates an object of Scanner
            Scanner input = new Scanner(System.in);
            //Get a from input
            number = input.nextInt();
            // closes the scanner
            input.close();
        } else {
            //Read a from args
            number = Integer.parseInt(args[0]);
        }

        int originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}