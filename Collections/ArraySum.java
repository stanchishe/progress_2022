public class ArraySum {
    public static void main(String[] args) {
        int[] arrOne = {1, 3, 66, 23, 44};
        int sumOne = 0;
        for(int i = 0; i < arrOne.length; i++) {
            System.out.println(arrOne[i]);
            sumOne += arrOne[i];
        }
        System.out.println("The total sum of arrOne was " + sumOne);

        int[][] arrTwo = {
                {1, 3, 66, 23, 44},
                {1, 3, 66, 23, 44},
                {1, 3, 66, 23, 44}
        };
        int sumTwo = 0;
        System.out.println(arrTwo.length);
        System.out.println(arrTwo[0].length);

        for(int i = 0; i < arrTwo.length; i++) {
            for (int j = 0; j < arrTwo[0].length; j++) {
                sumTwo += arrTwo[i][j];
            }
        }
        System.out.println(sumTwo);
    }
}
