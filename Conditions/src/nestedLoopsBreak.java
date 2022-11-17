public class nestedLoopsBreak {

    public static void main(String... args) {

        for (int i = 0; i < 5; ++i) {
            HERE:
            for (int j = 0; j < 5; ++j) {
                for (int k = 0; k < 5; ++k) {
                    System.out.println("(i, j, k) = (" + i + "," + j + "," + k + ")");
                    if (i == j && j == k) {
                        break HERE;
                    }
                }
            }
            System.out.println("We broke out!");
        }
    }
}
