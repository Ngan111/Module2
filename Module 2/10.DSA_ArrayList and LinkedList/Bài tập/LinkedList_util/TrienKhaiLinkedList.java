package Queue;

public class TrienKhaiLinkedList {
    public static class MyLinkedList<E> {
        public class Node {
            private Node next;
            private Object data;

            public Node(Object data) {
                this.data = data;
            }

            public Object getData() {
                return data;
            }
        }
        //Phan tu dau tien cua danh sach lien ket
        private Node head;
        //So luong phan tu trong danh sach lien ket
        private int numNodes;

        public MyLinkedList() {
        }

        //Phuong thuc add phan tu vao dau danh sach
        public void addFirst(E element) {
            Node temp = head;
            head = new Node(element);
            head.next = temp;
            numNodes++;
        }
        //Phuong thuc add phan tu vao cuoi danh sach
        public void addLast(E element) {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(element);
            numNodes++;
        }
        //Phuong thuc add phan tu vao vi tri index danh sach
        public void add(int index, E element) {
            Node temp = head;
            Node holder;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            //Cho holder tham chieu den vi tri index
            holder = temp.next;
            //Node tai vi tri index -1 se tro den node moi.
            temp.next = new Node(element);
            //Node moi se tro den holder
            temp.next.next = holder;
            //Tang so luong phan tu trong ds lien ket
            numNodes++;
        }
        //Lay phan tu tai vi tri index
        public Object get(int index) {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
        //Lay kich thuoc cua LinkedList
        public int size() {
            return this.numNodes;
        }

        public E remove(int index) {
            if (index < 0 || index > numNodes) {
                throw new IllegalArgumentException("index " + index);
            }
            //Khai bao bien Temp tro den head
            Node temp = head;
            Object data;
            //Neu index = 0, se tro den data hien tai
            if (index == 0) {
                data = temp.data;
                head = head.next;
                numNodes--;
            } else {
                //dang o vi tri index-1
                for (int i = 0; i < index - 1 && temp.next != null; i++) {
                    temp = temp.next;
                }
                data = temp.next.data;

                 //Set vi tri temp(index-1)=temp(index+1)
                temp.next = temp.next.next;
                numNodes--;
            }
            return (E) data;
        }

        public boolean remove(E element) {
            if (head.data.equals(element)) {
                remove(0);
                return true;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    if (temp.next.data.equals(element)) {
                        temp.next = temp.next.next;
                        numNodes--;
                        return true;
                    }
                    temp = temp.next;
                }
            }
            return false;
        }

        public MyLinkedList<E> clone() {
            if (numNodes == 0) {
                throw new NullPointerException("LinkedList này null");
            }
            Node temp = head;
            MyLinkedList<E> returnMyLinkedList = new MyLinkedList<>();
            returnMyLinkedList.addFirst((E) temp.data);
            temp = temp.next;
            while (temp != null) {
                returnMyLinkedList.addLast((E) temp.data);
                temp = temp.next;
            }
            return returnMyLinkedList;
        }

        public boolean contains(E element) {
            return indexOf(element) >= 0;
        }

        public int indexOf(E element) {
            Node temp = head;
            for (int i = 0; i < numNodes; i++) {
                if (temp.data.equals(element)) {
                    return i;
                }
                temp = temp.next;
            }
            return -1;
        }

        public void clear() {
            Node temp = head;
            head = null;
            while (temp.next != null) {
                temp.next = null;
            }
            numNodes = 0;
        }
    }

}
