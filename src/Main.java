public class Main {
    public static void main(String[] args) {

        System.out.println("Main thread started: "+ Thread.currentThread().getName());
        SharedResource sharedResource= new SharedResource();
        Thread thread1= new Thread(new ProduceItem(sharedResource));
        Thread thread2 = new Thread(new ConsumeItem(sharedResource));

        thread1.start();
        thread2.start();

        System.out.println("Main thread getting over");
    }
}