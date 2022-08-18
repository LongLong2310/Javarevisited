import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class blockingQueue {
    public static void main(String[] args){
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingDeque<Integer>();

        blockingQueue.add(2);
        blockingQueue.add(5);
        blockingQueue.add(4);
        blockingQueue.add(1);

        System.out.println(blockingQueue);

        if (blockingQueue.contains(2))
            System.out.println("The Blocking Queue contains 2");
        else
            System.out.println("The Blocking Queue contains 2");

        System.out.println("The head of the Queue: " + blockingQueue.element());

        blockingQueue.remove(4);
        blockingQueue.remove(2);

        System.out.println("The Blocking Queue after remove: " + blockingQueue);

        Iterator<Integer> integerIterator = blockingQueue.iterator();

        blockingQueue.add(2);
        blockingQueue.add(5);
        blockingQueue.add(4);
        blockingQueue.add(1);

        System.out.println("The Blocking Queue: ");

        for (int i = 0; i < blockingQueue.size(); i++){
            System.out.print(integerIterator.next() + " ");
        }


    }
}
