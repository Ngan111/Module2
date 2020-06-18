package introductionJava.baitap;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer>listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(8);
        listInteger.add(24);
        listInteger.add(6);

        System.out.println("Element 2: "+listInteger.get(2));
        System.out.println("Element 3: "+listInteger.get(3));
    }

}
