public class StringFormat {
    public static void main(String[] args) {
        System.out.println(
                String.format("The name of the agent is %s and he is %d years old.","John Snow", 35)
                );


        System.out.println(String.format("%2.3f", 12.1234));
        System.out.println(String.format("%1.50f", 12.1234));
    }
}
