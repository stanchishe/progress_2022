public class CompareTo {
    public static void main(String args[]){
        String s1="hello";
        String s2="hello";
        String s3="zello";
        String s4="heplo";
        String s5="cookie";
        System.out.println(s1.compareTo(s2));//0 because both are equal
        System.out.println(s1.compareTo(s3));//-18 because "h" is 5 times lower than "z"
        System.out.println(s1.compareTo(s4));//-4 because "l" is 1 times lower than "p"
        System.out.println(s1.compareTo(s5));//5 because "h" is 2 times greater than "c"
    }
}
