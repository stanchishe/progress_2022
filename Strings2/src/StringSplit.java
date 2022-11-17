public class StringSplit {
    public static void main(String[] args) {
        String string = "I am an Englishman in New York";
        String[] split = string.split(" ");

        System.out.println(split[1]);
    }

    public static void Split(String[] args) {
        StringBuilder string = new StringBuilder("EVIL STAR");
        String reverse = "";
        for(int i = string.length(); i > 0; i--){
            reverse += string.charAt(i-1);
        }
        System.out.println(reverse);
        System.out.println(string.reverse());
    }
}
