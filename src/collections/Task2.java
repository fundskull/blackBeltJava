package collections;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Task2 {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "123",
                66,
                new Address(1, "Street"),
                Collections.singletonList(new CellNumber("777-555-666", 3.140)
                )
        );
//        Customer cloneCustomer = customer.clone();
//
//        System.out.println(customer.equals(cloneCustomer));

    }
}

class Customer {
    String id;
    int age;
    Address address;
    List<CellNumber> number;

    public Customer(String id, int age, Address address, List<CellNumber> number) {
        this.id = id;
        this.age = age;
        this.address = address;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && Objects.equals(id, customer.id) && Objects.equals(address, customer.address) && Objects.equals(number, customer.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, address, number);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class CellNumber implements Cloneable {
    String number;
    double coverage;

    public CellNumber(String number, double coverage) {
        this.number = number;
        this.coverage = coverage;
    }

    @Override
    public CellNumber clone() {
        try {
            CellNumber clone = (CellNumber) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

class Address {
    int id;
    String name;

    public Address(int id, String name) {
        this.id = id;
        this.name = name;
    }
}