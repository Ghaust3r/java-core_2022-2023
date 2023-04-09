package lr13;

public class task2 {
    public static void main(String[] args)throws InterruptedException {
        Thread t1=new Thread(()->{
         for (int i=1;i<=10;i++){
             System.out.println(i);
             try{
                 Thread.sleep(1000);
             }catch (InterruptedException e){
                 System.err.println(e);
             }
         }
        });
        t1.start();
        t1.join();
    }
}
