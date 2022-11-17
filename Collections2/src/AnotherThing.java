public class AnotherThing {
    public static void main(String[] args) {
        for(int i = 0; i <= 3; i++) {
            SomethingElse myThing = new SomethingElse(i);
            Thread myThread = new Thread(myThing);
            myThread.start();
//            try {
//                myThread.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            System.out.println(myThread.isAlive());
        }
    }
}
