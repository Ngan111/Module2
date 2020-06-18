package Queue;

public class ReserveInStack {
    private int arr[];
    private int size;
    private int index = 0;
    public ReserveInStack(int size) {
        this.size = size;
        arr = new int[size];
    }
    public void push(int element) {
        arr[index] = element;
        index++;
    }
    public int pop() {
        return arr[index-1];
    }
    public void display() {
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
    public void reserve() {
        for (int j = 0; j < arr.length/2; j++) {
            int temp = arr[j];
            arr[j] = arr[size - 1 - j];
            arr[size - 1 - j] = temp;
        }
        for (int j = 0;j < arr.length; j++) {
            System.out.print(arr[j]+"\t");
        }

    }
    public static class Test{
        public static void main(String[] args) {
            ReserveInStack reserveInStack = new ReserveInStack(6);
            reserveInStack.push(246);
            reserveInStack.push(680);
            reserveInStack.push(267);
            reserveInStack.push(240);
            reserveInStack.push(340);
            reserveInStack.push(205);
            System.out.println("The array before arranging: ");
            reserveInStack.display();
            System.out.println("The last element is: "+reserveInStack.pop());
            System.out.println("The array after arranging: ");
            reserveInStack.reserve();
        }
    }
}
