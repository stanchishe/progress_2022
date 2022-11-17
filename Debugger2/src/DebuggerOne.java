public class DebuggerOne {
    public static void main(String[] args) {
        int a = 9;
        int b = 12;

        int addition = sum(a, b);

        System.out.println("a + b = " + addition);

    }
    private static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
