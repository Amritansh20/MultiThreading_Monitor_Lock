public class ProduceItem implements Runnable{
    SharedResource sharedResource;

    ProduceItem(SharedResource sharedResource){
        this.sharedResource=sharedResource;
    }

    @Override
    public void run() {
        System.out.println("Producer thread: "+ Thread.currentThread().getName());
        try{
            Thread.sleep(5000l);
        }catch (Exception e){

        }
        sharedResource.addItem();
    }
}
