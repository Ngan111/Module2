package Queue;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;
    public MyGenericStack(){
        stack = new LinkedList();
    }
    public void push(T element) {
        stack.addFirst(element);
    }
    public boolean isEmpty() {
        if (stack.size() == 0){
            return true;
        }
        return false;
    }
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size() {
        return stack.size();
    }
    private static void stackOfString() {
        MyGenericStack<String>stack = new MyGenericStack();
        stack.push("heineken ");
        stack.push("tiger, ");
        stack.push("larue, ");
        System.out.println("A.Size of stack after pushing: "+ stack.size());
        System.out.printf("B.Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.printf("%S",stack.pop());
        }
        System.out.println("\nC.Size of stack after pop operations: "+stack.size());
    }
    public static class Client{
        public static void main(String[] args) {
            System.out.println("Stack of string: ");
            stackOfString();
        }
    }
    private static void StackOfIntegers() {
        MyGenericStack<Integer>stack = new MyGenericStack();
        stack.push(24);
        stack.push(6);
        stack.push(11);
        stack.push(1);
        System.out.println("1.Size of stack push operations: "+stack.size());
        System.out.printf("2.Pop elements from stack: ");
        while (!stack.isEmpty()){
            System.out.printf("%d",stack.pop());
        }
        System.out.println("\n3. Size of stack after pop operations: "+stack.size());
    }
    public static class Test{
        public static void main(String[] args) {
            System.out.println("\n2.Stack of integers:");
            StackOfIntegers();
        }
    }
}
