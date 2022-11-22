public class AssertExample {
    public static void main(String[] args) {
        int age = 16;
        assert age >= 18 : "Underage";
        System.out.println("The voter is " + age);
    }
}
