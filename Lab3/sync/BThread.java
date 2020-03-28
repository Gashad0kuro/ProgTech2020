

public class BThread extends Thread {

   private Bank bankWork = new Bank();

   private int intTrans;
   private long lngSleep;
   


   public BThread(Bank bank, int trans, long sleep){

    this.bankWork = bank;
    this.intTrans = trans;
    this.lngSleep = sleep;
   }

   public void run(){
       synchronized (bankWork){
           bankWork.calc(intTrans, lngSleep);
       };
      
   }



}