import java.util.Scanner;

public class switchStatements {
    public static void main(String... args) {
        // Gold, Silver, Bronze
        //Init a
        int a = 0;

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

        String medal = "";
        switch (a) {
            case 1:
                medal = "Gold";
                break;
            case 2:
                medal = "Silver";
                break;
            case 3:
                medal = "Bronze";
                break;
            default:
                System.out.println("Error");
        }
        System.out.println(medal);
    }
}
