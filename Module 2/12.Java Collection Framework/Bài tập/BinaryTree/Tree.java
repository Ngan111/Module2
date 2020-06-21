package BinaryTree;

public interface Tree<E> {
    public boolean add(E e);
    public void displayPostOrder();
    public void displayInOrder();
    public void displayPreOrder();
    public int size();
    public void breathFirst();

}