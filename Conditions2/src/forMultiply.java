public class forMultiply {

    //Write a program that by given integer prints the multiplication
    // table of that number (from 1 to the given number).

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);

        for (int i = 1; i <= a; ++i){
            System.out.println(a + " X " + i + " = " + i*a);
        }
    }
}
