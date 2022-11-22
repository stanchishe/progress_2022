import java.util.Scanner;

public class UncheckedExceptionPartTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] intArr = new Integer[5];

        System.out.println("Enter the number you want to add: ");
        int numberToAdd = scanner.nextInt();

        System.out.println("Where would you like to add it? ");
        int indexToAddTo = scanner.nextInt();

        if (indexToAddTo > intArr.length || indexToAddTo <= 0) {
            System.out.println("The provided value is beyond the bounds of the array!");
            return;
        }
        intArr[indexToAddTo - 1] = numberToAdd;

        scanner.close();
        for(int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }
}
