public class forLoop {
        public static void main(String... args) {
            // Number of floors, number of apts per floor.
            int floors = 7;
            int apts = 5;

            for(int f = 0; f <= floors; ++f) {
                for (int a = 1; a <= apts; ++a) {

                    System.out.println("I am in apt " + a + " of floor " + f);
                }
            }
        }
    }
