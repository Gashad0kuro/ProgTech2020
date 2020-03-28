
public class Main {
    public static void main(String[] args) {

        Bank bankMain = new Bank();
        BThread threadOne = new BThread(bankMain, 100, 2000);

        threadOne.setName("thread_PRIMA");
        threadOne.setPriority(Thread.MAX_PRIORITY);
        threadOne.start();

        BThread threadTwo = new BThread(bankMain, 50, 300);

        threadTwo.setName("tread_SECUNDA");
        threadTwo.setPriority(Thread.MAX_PRIORITY);
        threadTwo.start();

        Thread.currentThread().getName();

    }
}
