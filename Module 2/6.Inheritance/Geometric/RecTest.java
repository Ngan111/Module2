package introductionJava.baitap;

public class RecTest {
    public static void main(String[] args) {
        Rec rec = new Rec();
        System.out.println(rec);
        Rec rec2 = new Rec(4,6,"Black",false);
        System.out.println(rec2);
        Rec rec3 = new Rec(6,8);
        System.out.println(rec3);

    }
}
