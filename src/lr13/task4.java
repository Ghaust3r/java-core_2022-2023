package lr13;



public class task4 {
    public static void main(String[] args) throws InterruptedException {
int a=10;
            returnThread(a);
    }
    public static void returnThread(int a) throws InterruptedException {
for (int i=1;i<=a;i++){
    if (i==1){
        int final1 = i;
        Thread t1 = new Thread(()-> {
                System.out.println("Number of stream: " + final1);
            });
        t1.start();
        t1.join();
    }
    if (i==2){
        int final2 = i;
        Thread t2 = new Thread(()-> {
            System.out.println("Number of stream: " + final2);
        });
        t2.start();
        t2.join();
    }
    if (i==3){
        int final3 = i;
        Thread t3 = new Thread(()-> {
            System.out.println("Number of stream: " + final3);
        });
        t3.start();
        t3.join();
    }
    if (i==4){
        int final4 = i;
        Thread t4 = new Thread(()-> {
            System.out.println("Number of stream: " + final4);
        });
        t4.start();
        t4.join();
    }
    if (i==5){
        int final5 = i;
        Thread t5 = new Thread(()-> {
            System.out.println("Number of stream: " + final5);
        });
        t5.start();
        t5.join();
    }
    if (i==6){
        int final6 = i;
        Thread t6 = new Thread(()-> {
            System.out.println("Number of stream: " + final6);
        });
        t6.start();
        t6.join();
    }
    if (i==7){
        int final7 = i;
        Thread t7 = new Thread(()-> {
            System.out.println("Number of stream: " + final7);
        });
        t7.start();
        t7.join();
    }
    if (i==8){
        int final8 = i;
        Thread t8 = new Thread(()-> {
            System.out.println("Number of stream: " + final8);
        });
        t8.start();
        t8.join();
    }
    if (i==9){
        int final9 = i;
        Thread t9 = new Thread(()-> {
            System.out.println("Number of stream: " + final9);
        });
        t9.start();
        t9.join();
    }
    if (i==10){
        int final10 = i;
        Thread t10 = new Thread(()-> {
            System.out.println("Number of stream: " + final10);
        });
        t10.start();
        t10.join();
    }
            }
    }
}
