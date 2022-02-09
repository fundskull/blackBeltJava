package annotation_example;

import java.beans.JavaBean;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@MyAnnotation
public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @MyAnnotation
    public double increaseSalary(int salary) {
        return salary * 2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name = " + name +
                ", salary = " + salary +
                "}";
    }
}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {

}