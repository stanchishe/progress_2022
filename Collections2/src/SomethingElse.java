public class SomethingElse implements Runnable {

    private int number;
    public SomethingElse(int number){
        this.number = number;
    }
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " is the current Thread!");
            if(number == 2) {
                throw new RuntimeException();
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {

            }
        }
    }
}
