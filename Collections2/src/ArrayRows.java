public class ArrayRows {
    public static void main(String[] args) {
        int[][] fiveSquare = new int[5][5];
        int counter = 0;
        for(int i = 0; i < fiveSquare.length; i++) {
            for(int j = 0; j < fiveSquare[0].length; j++) {
                fiveSquare[i][j] = (j + 1) + counter*5;
                // Or use the previous line when it exists (add condition to avoid any errors!)
                //fiveSquare[i][j] = fiveSquare[i - 1][j] + 5;
            }
            counter++;
        }

        for(int i = 0; i < fiveSquare.length; i++) {
            for (int j = 0; j < fiveSquare[0].length; j++) {
                System.out.print(fiveSquare[i][j] + ", ");
            }
            System.out.println("\n");
        }
    }
}
