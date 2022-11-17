import java.util.Scanner;

public class CheckIfNegative {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String myName = "Stanko";
        System.out.println("Please, enter your name:");
        String nameToCheck = scanner.next();

        boolean nameEval = (myName.equals(nameToCheck)) ? true : false;

        if (nameEval) {
            System.out.println("The name is correct! Wooo!");
        } else {
            System.out.println("Guess again!");
        }

    }
}
