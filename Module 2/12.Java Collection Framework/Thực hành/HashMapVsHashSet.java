import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapVsHashSet {
    public static class Student{
        private String name;
        private int age;
        private String address;
        public Student(){

        }
        public Student(String name, int age, String address) {
            super();
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
        @Override
        public String toString() {
            return "Student's name= "+ name +", age "+ age +",address "+ address;
        }
    }
    public static class test {
        public static void main(String[] args) {
            Student student1 = new Student("Tom",8,"ABC");
            Student student2 = new Student("Kitty",8,"HD");
            Student student3 = new Student("Kevin",7,"CDE");
            Student student4 = new Student("Ken",5,"AAA");
            Map<Integer,Student> studentMap = new HashMap<Integer,Student>();
            studentMap.put(1,student1);
            studentMap.put(2,student2);
            studentMap.put(3,student3);
            studentMap.put(4,student1);
            for (Map.Entry<Integer,Student> student : studentMap.entrySet()) {
                System.out.println(student.toString());
            }
            System.out.println("........Set");
            //Set không lưu trùng giá trị
            Set<Student> students = new HashSet<Student>();
            students.add(student1);
            students.add(student2);
            students.add(student3);
            students.add(student1);
            for (Student student:students){
                System.out.println(student.toString());
            }

        }
    }
}
