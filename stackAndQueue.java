import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stackAndQueue {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<Integer>();
//
//        stack.push(4);
//        stack.push(3);
//        stack.push(8);
//        stack.push(9);
//
//        System.out.println(stack);
//
//        stack.pop();
//
//        System.out.println("After remove top of the stack: " + stack);
//
//        System.out.println("The top of the stack: " + stack.peek());
//
//        if (stack.isEmpty())
//            System.out.println("The stack is empty");
//        else
//            System.out.println("The stack is not empty");
//
//        if (stack.search(9) == -1){
//            System.out.println("9 is not in the stack");
//        }
//        else
//            System.out.println("9 is in the stack");

        Queue<Integer> q = new LinkedList<>();

        q.add(4);
        q.add(1);
        q.add(9);
        q.add(0);

        System.out.println(q);

        q.remove(9);

        System.out.println("Queue after remove: " + q);

        System.out.println("The head of the Queue: " + q.peek());
    }
}
