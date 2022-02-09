package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-13);
        list.add(-8);
        list.add(-3);
        list.add(0);
        list.add(5);
        list.add(12);
        list.add(1);
        list.add(-30);
        list.add(150);
        list.add(-17);
        list.add(23);
        list.add(-40);
        list.add(56);
        list.add(11);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);

//        Collections.sort(list);
//        System.out.println(list);
//        int index1 = Collections.binarySearch(list, 12);
//        System.out.println(index1);
//        System.out.println(Collections.binarySearch(list, index1));

//        ArrayList<Employee> empList = new ArrayList<>();
//        Employee employee1 = new Employee(100, "Zaur", 12345);
//        Employee employee2 = new Employee(15, "Ivan", 6542);
//        Employee employee3 = new Employee(123, "Petr", 8542);
//        Employee employee4 = new Employee(15, "Mariya", 5678);
//        Employee employee5 = new Employee(182, "Kolya", 125);
//        Employee employee6 = new Employee(15, "Sasha", 9874);
//        Employee employee7 = new Employee(250, "Elena", 1579);
//        empList.add(employee1);
//        empList.add(employee2);
//        empList.add(employee3);
//        empList.add(employee4);
//        empList.add(employee5);
//        empList.add(employee6);
//        empList.add(employee7);
//        System.out.println(empList);
//        Collections.sort(empList);
//        System.out.println(empList);
//        int index = Collections.binarySearch(empList,
//                new Employee(182, "Kolya", 125));
//        System.out.println(index);

//        int[] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        int index = Arrays.binarySearch(array, 150);
//        System.out.println(index);
    }

}

class Employee implements Comparable<Employee>  {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "id = " + id +
                ", name = " + name +
                ", salary = " + salary;
    }


    @Override
    public int compareTo(Employee o) {
        int a = this.id - o.id;
        if (a == 0) {
            a = this.name.compareTo(o.name);
        }
        return a;
    }
}

class SortById implements Comparator<Employee> {
    public int compare(Employee emp1, Employee emp2) {
        return emp1.id - emp2.id;
    }
}