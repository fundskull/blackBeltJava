package collections;

import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student3> treeSet = new TreeSet<>();
        Student3 s1 = new Student3("Zaur", 5);
        Student3 s2 = new Student3("Misha", 1);
        Student3 s3 = new Student3("Igor", 2);
        Student3 s4 = new Student3("Marina", 3);
        Student3 s5 = new Student3("Olya", 4);
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
    }
}

class Student3 implements Comparable<Student3> {
    String name;
    int course;

    public Student3(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student3 o) {
        return this.course - o.course;
    }

    public String toString() {
        return "Student3{" +
                "name = " + name +
                ", course = " + course;
    }
}
