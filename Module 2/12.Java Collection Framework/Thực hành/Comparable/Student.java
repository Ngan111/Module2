import com.sun.corba.se.impl.oa.toa.TOA;

import java.util.*;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String address;

    public Student(String name, int age, String address) {
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

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" + "name'" + name + '\'' + '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }

    public static class AgeComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            if (o1.getAge() > o2.getAge()) {
                return 1;
            } else if (o1.getAge() == o2.getAge()) {
                return 0;
            } else {
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Tina", 10, "abc");
        Student student2 = new Student("Dolly", 11, "bcd");
        Student student3 = new Student("Paul", 5, "efg");
        Student student4 = new Student("Anna", 9, "zzz");
        List<Student> lists = new ArrayList<Student>();
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);
        Collections.sort(lists);
        for (Student st : lists) {
            System.out.println(st.toString());
        }
            AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
            System.out.println("Compare according to age");
            for (Student st : lists) {
                System.out.println(st.toString());
            }
        }
    }

