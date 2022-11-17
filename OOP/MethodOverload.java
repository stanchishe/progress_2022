public class MethodOverload {
    public static void main(String[] args) {

        int totalSumOne = sum(5,10);
        System.out.println(totalSumOne);

        double totalSumTwo = sum(5.1,10);
        System.out.println(totalSumTwo);

        double totalSumThree = sum(5.1,10.2);
        System.out.println(totalSumThree);

    }
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}
