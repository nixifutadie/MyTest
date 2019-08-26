package others.thread;

public class Testthread implements Runnable{

    private int i  = 100;

    @Override
    public  void run() {
        while (i>0){
            /*try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            i--;
            System.out.println(Thread.currentThread().getName()+" 票数还剩"+i);
        }


    }


    public static void main(String[] args) {
        Testthread testthread = new Testthread();
        Thread thread = new Thread(testthread);
        Thread thread1 = new Thread(testthread);
        thread.start();
        thread1.start();
    }


}
