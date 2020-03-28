
public class Bank {
    private int intTO;
    private int intFrom = 220;

    /*
     * public void setIntFrom(int intFrom) { this.intFrom = intFrom; }
     */

    public void setIntTO(int intTO) {
        this.intTO = intTO;
    }

    public int getIntFrom() {
        return intFrom;
    }

    public int getIntTO() {
        return intTO;
    }

    
    public void calc (int intTransaction, long lngTimeout) {
        System.out
                .println("BEFORE  From: " + intFrom + " To: " + intTO + " thread: " + Thread.currentThread().getName());
        intFrom -= intTransaction;

        try {
            Thread.sleep(lngTimeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        intTO += intTransaction;
        System.out
                .println("AFTER  From: " + intFrom + " To: " + intTO + " thread: " + Thread.currentThread().getName());

    }

}