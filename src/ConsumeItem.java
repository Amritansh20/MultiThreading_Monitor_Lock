public class ConsumeItem implements Runnable{
    SharedResource sharedResource;

    ConsumeItem(SharedResource sharedResource){
        this.sharedResource=sharedResource;
    }
    @Override
    public void run() {
        System.out.println("Consumer Thread: "+ Thread.currentThread().getName());
        sharedResource.consumeItem();
    }
}
