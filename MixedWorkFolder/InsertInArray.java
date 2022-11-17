import java.util.Scanner;

public class InsertInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many entries would you like your array to have?\n");
        int length = scanner.nextInt();
        String[] namesArr = new String[length];

        while (true) {
            System.out.print("Enter the index where you want to add:\n");
            int index = scanner.nextInt();
            if(!(index < length)){
                System.out.println("The selected index is outside of the arrays range!\n");
                continue;
            }
            System.out.print("Enter the name you want to record:\n");
            String name = scanner.next();
            namesArr[index] = name;
            System.out.print("Would you like to enter another name? yes/no\n");
            String answer = scanner.next();
            if(!answer.equals("yes")) {
                break;
            }
        }
        // closes the scanner
        scanner.close();
        for(int i =0; i < namesArr.length; i++ ) {
            System.out.println(namesArr[i]);
        }
    }
}