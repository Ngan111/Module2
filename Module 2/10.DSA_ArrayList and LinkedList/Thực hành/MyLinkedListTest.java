package introductionJava.baitap;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("TEST");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(13);
        ll.addFirst(24);
        ll.printList();
    }
}
