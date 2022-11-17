public class AnotherThing {
    public static void main(String[] args) {
        for(int i = 0; i <= 3; i++) {
            SomethingElse myThing = new SomethingElse(i);
            // Thread myThread = new Thread(myThing);
            // myThread.start();

            // myThing.run(); //Runs the run method. We don't want that!
            myThing.start();
            try {
                myThing.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(myThing.isAlive());
        }
    }
}
