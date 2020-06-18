package demergingQueue;

import java.util.LinkedList;
import java.util.Queue;

public class ArrangingData {
    public static void main(String[] args) {
        Queue<Employee> male = new LinkedList<>();
        Queue<Employee> female = new LinkedList<>();
        int size = 5;
        Employee[] info = new Employee[size];

        info[0] = new Employee("Công","Male","24/6/1994");
        info[1] = new Employee("Hà","Female","12/12/1986");
        info[2] = new Employee("Thắng","Female","13/04/1988");
        info[3] = new Employee("Phương","Male","25/10/1990");
        info[4] = new Employee("Duyên","Female","19/05/1995");

        for (int i = 0; i < size; i++) {
            if (info[i].getGender().equals("Male")) {
                male.add(info[i]);
            } else if (info[i].getGender().equals("Female")) {
                female.add(info[i]);
            }
        }

        while(!female.isEmpty()){
            System.out.println(female.remove().toString());
        }
        while(!male.isEmpty()){
            System.out.println(male.remove().toString());
        }
    }
}
