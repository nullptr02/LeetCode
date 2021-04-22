package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class EmployeeImportance {
    public int getImportance(List<Employee> employees, int id) {
        int result = 0;
        int index = id;

        for (Employee i : employees) {

            boolean flag = i.subordinates.contains(index+1);

            if (i.id >= id && flag) {
                result += i.importance;
            }

        }


        return result;
    }

    public static void main(String[] args) {

        EmployeeImportance u = new EmployeeImportance();

        Employee one = new Employee();
        one.id = 1;
        one.importance = 5;
        one.subordinates.add(2);
        one.subordinates.add(3);

        Employee two = new Employee();
        two.id = 2;
        two.importance = 3;


        Employee three = new Employee();
        three.id = 3;
        three.importance = 3;

        List<Employee> list = new ArrayList<>();

        list.add(one);
        list.add(two);
        list.add(three);


        System.out.println(u.getImportance(list, 1));


    }
}
