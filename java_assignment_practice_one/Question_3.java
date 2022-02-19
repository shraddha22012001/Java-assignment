class FetchData extends Thread{
    public void run(){
        for(int i=1; i<=2; i++){
        try {
            Thread.sleep(5000);
            System.out.println("FetchData thread is running......" + Thread.currentThread().getName());  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }
}

class ProcessData implements Runnable{
    public void run(){
        for(int i=1; i<=2; i++){
        try {
            Thread.sleep(1000);
            System.out.println("ProcessData thread is running...... "+ Thread.currentThread().getName());  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }

}

public class Question_3 {
    public static void main(String[] args) throws InterruptedException{
        FetchData fd = new FetchData();
        Thread t1 = new Thread(new ProcessData(), "Thread-1");

        fd.start();
        fd.join();
        t1.start();
        t1.join();
        
    }
}

/***************output*****************


FetchData thread is running......Thread-0
FetchData thread is running......Thread-0
ProcessData thread is running...... Thread-1
ProcessData thread is running...... Thread-1


***************************************/