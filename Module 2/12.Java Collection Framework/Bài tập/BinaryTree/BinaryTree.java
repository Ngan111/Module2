package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E>root;
    private int size = 0;
    

    public BinaryTree() {

    }
    public void BinaryTree(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            add(objects[i]);
    }
    //Add nodes
    @Override
    public boolean add(E e) {
        if (root == null) {
            root = createNewNode(e);
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while(current!=null) {
                if (e.compareTo(current.element)<0) {
                    parent = current;
                    current = current.left;
                } else if(e.compareTo(current.element)>0) {
                    parent = current;
                    current = current.right;
                } else return false;
            }

            if (e.compareTo(parent.element)<0) {
                parent.left = createNewNode(e);
            } else if (e.compareTo(parent.element)>0) {
                parent.right = createNewNode(e);
            }
        }
        this.size++;
        return true;
    }
    protected TreeNode<E>createNewNode(E e) {
        return new TreeNode<>(e);
    }

    //How to get the size of binary tree
    @Override
    public int size() {
        return this.size;
    }

    //Display the binary tree in many forms: Post order, pre order, in order, and breath first.
    @Override
    public void displayPostOrder() {
        displayPostOrder(root);
    }

    protected void displayPostOrder(TreeNode<E> root) {
        if (root==null) {
            return;
        }
        if (root.left!=null) {
            displayPostOrder(root.left);
        }
        if (root.element!=null) {
            System.out.println(root.element);
        }
        if (root.right!=null) {
            displayPostOrder(root.right);
        }
    }
    @Override
    public void displayInOrder() {
        displayInOrder(root);
    }

    protected void displayInOrder(TreeNode<E> root) {
        if (root == null) return;
        displayInOrder(root.left);
        System.out.print(root.element + " ");
        displayInOrder(root.right);
    }
    @Override
    public void displayPreOrder() {
        displayPreOrder(root);
    }

    protected void displayPreOrder(TreeNode<E> root) {
        if (root == null) return;
        System.out.print(root.element + " ");
        displayPreOrder(root.left);
        displayPreOrder(root.right);
    }

    @Override
    public void breathFirst() {
        breathFirst(root);
    }
    protected void breathFirst(TreeNode<E> root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return;
        queue.add(root);
        TreeNode<E> temp;
        while (!queue.isEmpty()) {
            temp = queue.peek();
            System.out.print(queue.poll().element + " ");

            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
    }
    //Delete a node.
    public void deleteNode(E key) {
        deleteNode(root, key);
    }
    private TreeNode deleteNode(TreeNode<E> root, E key) {
        if (root == null) return null;
        if (key.compareTo(root.element) < 0) {
            root.left = deleteNode(root.left, key);
        } else {
            if (key.compareTo(root.element) > 0) {
                root.right = deleteNode(root.right, key);
            } else {

                if (root.left == null) return root.right;
                if (root.right == null) return root.left;

                TreeNode<E> temp = root.right;
                while (temp != null) {
                    if (temp.left == null) break;
                    temp = temp.left;
                }
                E min_at_right = temp.element;
                root.element = min_at_right;
                root.right = deleteNode(root.right, min_at_right);
            }
        }
        return root;
    }
    public boolean searchNode(E key) {
        return searchNode(root, key);
    }

    private boolean searchNode(TreeNode<E> root, E key) {
        if (root == null) return false;
        if (key.compareTo(root.element) < 0)
            return searchNode(root.left, key);
        else if (key.compareTo(root.element) > 0)
            return searchNode(root.right, key);
        else
            return true;
    }
}
