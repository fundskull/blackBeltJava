package Task2;


import java.util.*;

class Task extends Object {
    public static void main(String[] args)  {
        Car car = new Car("MASHINKA", 100);
        Parovoz parovoz = new Parovoz("MASHINKA", 100);
        Poezd poezd = new Poezd("MASHINKA", 100);
        System.out.println(car.hashCode());
        System.out.println(parovoz.hashCode());
        System.out.println(poezd.hashCode());
//        List<String> list = new LinkedList<>();
//        list.add("privet");
//        list.add("kak dela");
//        list.add("poka");
//        System.out.println(list);
//        list.remove("poka");
//        System.out.println(list);
//
//
        String word = "World";
        char[] charArray = word.toCharArray();
        for (char a : charArray) {
            System.out.println(a);
        }

        StringBuilder stringBuilder1 = new StringBuilder("Asssddd");
        stringBuilder1.append("!!!!");
        System.out.println(stringBuilder1);
    }
}

public class SredstvoPeredvijenia {

    public String toString() {
        return "SredstvoPeredvijenia{}";
    }
}

class Car  {
    String name;
    int age;

    public Car(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return age == car.age && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

class Parovoz  {
    String name;
    int age;

    public Parovoz(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parovoz parovoz = (Parovoz) o;
        return age == parovoz.age && Objects.equals(name, parovoz.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

class Poezd  {
    String name;
    int age;

    public Poezd(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poezd poezd = (Poezd) o;
        return age == poezd.age && Objects.equals(name, poezd.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
