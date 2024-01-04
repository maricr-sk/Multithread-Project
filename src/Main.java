import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        //one way to make a thread
        Thread t1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        while (true) {
                            System.out.println("Inside thread:" + Thread.currentThread().getName());
                            try {
                                Thread.sleep(1000); // sleep for at least a second
                            } catch (Exception e) {
                                System.out.println("Unknown error");
                            }
                        }
                    }
                }
                , "t1");

        t1.start();
        while (true) {
            System.out.println("Inside thread:" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); // sleep for at least a second
            } catch (Exception e) {
                System.out.println("Unknown error");
            }
            System.out.println("Inside main thread");
        }
    }
} //can also extend a thread class - but might be extending one already