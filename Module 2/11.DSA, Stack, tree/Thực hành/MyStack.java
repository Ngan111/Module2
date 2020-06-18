package Queue;

public class MyStack {
    private int arr[];
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return arr[index-1];
    }
    public int size() {
        return index;
    }
    public void display() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
    public static class Test{
        public static void main(String[] args) throws Exception{
            MyStack myStack = new MyStack(9);
            myStack.push(267);
            myStack.push(680);
            myStack.push(205);
            myStack.push(246);
            myStack.push(240);
            myStack.push(340);
            myStack.display();
            System.out.println("Size of stack after pushing elements: "+myStack.size());
            myStack.pop();
            System.out.println("Size of stack after popping: "+myStack.pop());
        }
    }
}
