package annotation_example;

import java.lang.annotation.*;

public class Test2  {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomiClass = Class.forName("annotation_examples.Xiaomi");
        Annotation annotation1 = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone sm1 = (SmartPhone) annotation1;
        System.out.println("Annotation info from Xiaomi " + sm1.OS() + ", " + sm1.yearOfCompanyCreation());

        Class iphoneClass = Class.forName("annotation_examples.Xiaomi");
        Annotation annotation2 = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone sm2 = (SmartPhone) annotation2;
        System.out.println("Annotation info from Iphone " + sm2.OS() + ", " + sm2.yearOfCompanyCreation());
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    String OS();
    int yearOfCompanyCreation();
}

@SmartPhone(OS = "Android", yearOfCompanyCreation = 2010)
class Xiaomo {
    String model;
    double price;
}

@SmartPhone(OS = "IOS", yearOfCompanyCreation = 1976)
class Iphone {
    String model;
    double price;
}