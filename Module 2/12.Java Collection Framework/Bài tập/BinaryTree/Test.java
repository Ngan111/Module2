package BinaryTree;

public class Test {
    public static void main(String[] args) {
        BinaryTree<String> stringBinaryTree = new BinaryTree<String>();
        stringBinaryTree.add("24");
        stringBinaryTree.add("6");
        stringBinaryTree.add("92");
        stringBinaryTree.add("94");
        stringBinaryTree.add("18");
        stringBinaryTree.add("26");
        stringBinaryTree.displayPostOrder();
        //stringBinaryTree.displayInOrder();
        //stringBinaryTree.displayPreOrder();
        System.out.println("The size of binary tree is: "+stringBinaryTree.size());
        //stringBinaryTree.searchNode("92");
        stringBinaryTree.deleteNode("94");
        stringBinaryTree.displayPostOrder();
    }
}
