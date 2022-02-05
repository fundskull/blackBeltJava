package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        Employee employee1  = new Employee(100, "Zaur", "Tregulov", 12345);
        Employee employee2  = new Employee(15, "Ivan", "Petrov", 6543);
        Employee employee3  = new Employee(123, "Ivan", "Sidorov", 8543);
        empList.add(employee1);
        empList.add(employee2);
        empList.add(employee3);
        System.out.println("Before sort \n" + empList);
        Collections.sort(empList, new IdComparator());
        System.out.println("After IdComparator sort \n" + empList);
        Collections.sort(empList, new NameComparator());
        System.out.println("After NameComparator sort \n" + empList);
        Collections.sort(empList, new SalaryComparator());
        System.out.println("After SalaryComparator sort \n" + empList);
    }
}

class Employee implements Comparable<Employee>
        {
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String toString() {
        return "Employee {" +
                " id = " + id +
                " name = " + name +
                " surname = " + surname +
                " salary = " + salary;
    }


    @Override
    public int compareTo(Employee o) {
        if (this.id == o.id) {
            return 0;
        } else if (this.id < o.id) {
            return -1;
        } else {
            return 1;
        }
//        int result = this.name.compareTo(o.name);
//        if (result == 0) {
//            result = this.surname.compareTo(o.surname);
//        }
//        return result;
    }


//        return this.id - o.id;

    }

    class IdComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            if (o1.id == o2.id) {
                return 0;
            } else if (o1.id < o2.id) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    class NameComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.salary - o2.salary;
    }
}
