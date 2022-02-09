package collections;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Student2, Double> treeMap = new TreeMap<>();
        Student2 student1 = new Student2("Zaur", "Tregulov", 3);
        Student2 student2 = new Student2("Mariya", "Ivanova", 1);
        Student2 student3 = new Student2("Sergey", "Petrov", 4);
        Student2 student4 = new Student2("Igor", "Sidorov", 2);
        Student2 student5 = new Student2("Vasiliy", "Smirnov", 1);
        Student2 student6 = new Student2("Sasha", "Kapustin", 3);
        Student2 student7 = new Student2("Elena", "Sidorova", 4);
        treeMap.put(student1, 7.9);
        treeMap.put(student7, 6.4);
        treeMap.put(student3, 9.1);
        treeMap.put(student5, 7.2);
        treeMap.put(student4, 7.5);
        treeMap.put(student2, 5.8);
        treeMap.put(student6, 8.2);

        System.out.println(treeMap);
    }
}
