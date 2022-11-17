import java.util.Arrays;

public class StringsGeneric {
    public static void main(String[] args) {
        String[] arrStr = {"Mark", "John", "Anna", "Henri"};
//        MANUAL SORT LOGIC 
//        S1 > S2 and S1 > S3    S1 is the top string
//        S1 < S2 and S1 < S3    S1 is the bottom string
//        S1 > S2 and S1 < S3    S1 is the bottom string
//        S1 < S2 and S1 > S3    S1 is the middle string
//        MANUAL SORT USING FRO LOOP
//        for (int i = 0; i < arrStr.length; i++) {
//            for (int j = i + 1; j < arrStr.length; j++) {
//                if(arrStr[i].compareToIgnoreCase(arrStr[j]) > 0) {
//                    String temp = arrStr[i];
//                    arrStr[i] = arrStr[j];
//                    arrStr[j] = temp;
//                }
//            }
//        }
        Arrays.sort(arrStr);
        System.out.println(arrStr[0]);
    }
}