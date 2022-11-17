public class SomethingElse extends Thread {
    //public class SomethingElse extends SomeOtherClass implements Runnable, AnotherInterface {
    private int threadNum;
    public SomethingElse(int threadNum) {
        this.threadNum = threadNum;
    }
    @Override
    public void run(){
        for(int i = 0; i <= 5; i++) {
            System.out.println(i + " is the current thread number!");
            if(threadNum == 3) {
                throw new RuntimeException();
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
