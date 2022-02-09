import java.util.*;

public class Test100 {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        Employee employee1 = new Employee(1, "Lada", "White", 4);
        Employee employee2 = new Employee(3, "Mazda", "White", 4);
        Employee employee3 = new Employee(2, "Mazda", "Black", 4);
        empList.add(employee1);
        empList.add(employee2);
        empList.add(employee3);
        System.out.println("Before sorting \n" + empList);
        Collections.sort(empList);
        System.out.println("After sorting \n" + empList);
        Collections.sort(empList, new NameCoparingFormat());
        System.out.println("After sorting2 \n" + empList);

    }
}

class Employee implements Comparable<Employee> {
    int id;
    String model;
    String color;
    int wheelCount;


    public Employee(int id, String model, String color, int wheelCount) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.wheelCount = wheelCount;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", wheelCount=" + wheelCount +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
//        if (res == 0) {
//            this.model.compareTo(o.model);
//        }
//        return res;
//        if (this.id == o.id) {
//            return 0;
//        } else if (this.id > o.id) {
//            return 1;
//        } else {
//            return -1;
//        }
    }
}


class NameCoparingFormat implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        int res = emp1.color.compareTo(emp2.color);
        if (res == 0) {
            emp1.model.compareTo(emp2.model);
        }
        return res;
    }
}