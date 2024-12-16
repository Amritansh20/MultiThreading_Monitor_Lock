public class SharedResource {
    boolean itemAvailable;

    public synchronized void addItem() {
        itemAvailable = true;
        System.out.println("Item added by: " + Thread.currentThread().getName() + " and invoking all the Threads which are in waiting state");
        notifyAll();
    }

    public synchronized void consumeItem(){
        System.out.println("consumeItem method is invoked by Thread: " + Thread.currentThread().getName());
        while (!itemAvailable) {
            try {
                System.out.println("Thread: " + Thread.currentThread().getName() + " is waiting now");
                wait();
            } catch (Exception e) {

            }
        }
        System.out.println("Item consumed by thread: "+ Thread.currentThread().getName());
        itemAvailable=false;
    }

}
