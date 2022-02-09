package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo  {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        StudentInfo studentInfo = new StudentInfo();
//        studentInfo.testStudents(students, s -> s.avgGrade < 9);
//        System.out.println("--------------------------");
//        studentInfo.testStudents(students, s -> s.age > 20);
//        System.out.println("--------------------------");
//        studentInfo.testStudents(students, s -> s.age > 20 && s.avgGrade < 9.5 && s.sex == 'f');

//        Predicate<Student> predicate1 = s -> s.avgGrade > 7.5;
//        Predicate<Student> predicate2 = s -> s.sex == 'm';
//
//        studentInfo.testStudents(students, predicate1.and(predicate2));
//        System.out.println("--------------------------");
//        studentInfo.testStudents(students, predicate1.or(predicate2));
//        System.out.println("--------------------------");
//        studentInfo.testStudents(students, predicate1.negate());
//        studentInfo.testStudents(students, predicate2);
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int)o1.avgGrade - (int)o2.avgGrade;
//            }
//        });
//        Collections.sort(students, (s1, s2) -> s1.age - s2.age );
//        System.out.println(students);

//
//    void testStudents(ArrayList<Student> al, Predicate<Student> predicate) {
//        for (Student s : al) {
//            if (predicate.test(s)) {
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentOverGrade(ArrayList<Student> sl, double grade){
//        for (Student s : sl) {
//            if (s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentUnderAge(ArrayList<Student> sl, int age){
//        for (Student s : sl) {
//            if (s.age < age) {
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentMixCondition(ArrayList<Student> sl, int age, double grade, char sex){
//        for (Student s : sl) {
//            if (s.avgGrade < grade && s.age > age && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//    }
        double res = avgOfSomething(students, student -> (double)student.age);
        System.out.println(res);
    }
    Function<Student, Double> f = student -> 3.14;


    private static double avgOfSomething(ArrayList<Student> list, Function<Student, Double> function) {
        double result = 0;
        for (Student student : list) {
            result+=function.apply(student);
        }
        result = result/list.size();
        return result;
    }

}


