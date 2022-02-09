package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student2, Double> map = new HashMap<>();
        Student2 student1 = new Student2("Zaur", "Tregulov", 3);
        Student2 student2 = new Student2("Mariya", "Ivanova", 1);
        Student2 student3 = new Student2("Sergey", "Petrov", 4);
        map.put(student1, 7.5);
        map.put(student2, 8.7);
        map.put(student3, 9.2);
        System.out.println(map);
        Student2 student4 = new Student2("Zaur", "Tregulov", 3);
        Student2 student5 = new Student2("Igor", "Sidorov", 4);
        boolean result = map.containsKey(student2);
        System.out.println("result = " + result);
        System.out.println(student1.hashCode());
        System.out.println(student5.hashCode());

        for (Map.Entry<Student2, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        Map<Integer, String> map2 = new HashMap<>(16, 0.75f);

    }
}

class Student2 implements Comparable<Student2> {
    String name;
    String surname;
    int course;

    public Student2(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public String toString() {
        return "Student{" +
                "name = " + name +
                ", surname = " + surname +
                ", course = " + course;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return course == student2.course &&
                Objects.equals(name, student2.name) &&
                Objects.equals(surname, student2.surname);
    }

    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    public int compareTo(Student2 student1) {
        return this.name.compareTo(student1.name);
    }
}
