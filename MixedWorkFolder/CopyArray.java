public class CopyArray {
    public static void main(String[] args) {
        int[] arrInt = {11, 7, 58, 8};
        int[] secondArray = new int[arrInt.length];

        for(int i = 0; i < arrInt.length; i++) {
            secondArray[i] = arrInt[i];
        }        
        System.out.print(secondArray);
    }
}