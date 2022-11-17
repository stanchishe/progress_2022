public class ReverseArray {
    static void reverse(int array[], int length)
    {
        int[] b = new int[length];
        int j = length;
        for (int i = 0; i < length; i++) {
            b[j - 1] = array[i];
            j = j - 1;
        }
  
        for (int k = 0; k < length; k++) {
            System.out.println(b[k]);
        }
    }
  
    public static void main(String[] args)
    {
        int [] arr = {10, 20, 30, 40, 50};
        reverse(arr, arr.length);
    }
}