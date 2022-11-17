public class whileLoopCounter {
    public static void main(String[] args){
        int arr[] = {5, 1, 7, 2, 3};
        int i = 0;
        do  {
            if( i >= arr.length) {
                break;
            }
            System.out.println(arr[i]);
            ++i;
        } while (i > 1);
        System.out.println("Out of the loop!");
    }
}
