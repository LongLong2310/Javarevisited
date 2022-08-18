public class ThreadExample{
    public static void main(String[] args) {
        UserThread userThread = new UserThread();
        Thread thread = new Thread(userThread,"First Thread");
//
//        Thread thread2 = new Thread();
//        thread2.setName("SecondThread");
        thread.start();
        System.out.println(thread.getName() + " is stopping");
        userThread.stop();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(thread.getName() + " is finished");
    }

    public void run() {
        System.out.println("My name is: " + Thread.currentThread().getName());
    }
}

class UserThread implements Runnable{
    private volatile boolean exit = false;
    public void run(){
        while (!exit){
            System.out.println("The User Thread is running");
        }
        System.out.println("The User Thread is stopped");
    }

    public void stop(){
        exit = true;
    }
}
