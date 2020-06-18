package accessModifier;

public class Student {
    private int number;
    private String name;
    private static String college = "ABC";
    Student(int number,String name) {
        this.number = number;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getNumber(){
        return number;
    }
    public static void change() {
        college = "Codegym";
    }

    public static class Test{
        public static void main(String[] args) {
            Student.change();
            Student s1 = new Student(1,"Công");
            Student s2 = new Student(2,"Thắng");
            Student s3 = new Student(3,"Hà");
            System.out.println(s1.getNumber()+" "+s1.getName()+" "+college);
            System.out.println(s2.getNumber()+" "+s2.getName()+" "+college);
            System.out.println(s3.getNumber()+" "+s3.getName()+" "+college);

        }
    }
}
