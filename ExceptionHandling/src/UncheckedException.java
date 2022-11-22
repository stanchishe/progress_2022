import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] intArr = new Integer[5];

        System.out.println("Enter the number you want to add: ");
        int numberToAdd = scanner.nextInt();

        System.out.println("Where would you like to add it? ");
        int indexToAddTo = scanner.nextInt();

        try {
            intArr[indexToAddTo - 1] = numberToAdd;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Provided index is out of bounds. The final index is: " + intArr.length);
            return;
        } finally {
            System.out.println("Scanner closing!");
            scanner.close();
        }
        for(int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }
}
