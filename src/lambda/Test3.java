package lambda;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test3 {
    public static ArrayList<Car> creatThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> carList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            carList.add(carSupplier.get());
        }
        return carList;
    }

    public static void changeCar(Car car, Consumer<Car> consumer) {
        consumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> cars = creatThreeCars(() -> new Car("Mazda", "red", 1.6));
        System.out.println(cars);
        changeCar(cars.get(0), car -> {
            car.model = "BMW";
            car.color = "black";
            car.engine = 2.1;
        });
        System.out.println(cars);
    }
}

class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public String toString() {
        return "Car{" +
                "model = " + model +
                ", color = " + color +
                ", engine = " + engine +
                "}";
    }
    @Override
    public int hashCode() {
        return Objects.hash(model, color, engine);
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engine, engine) == 0 && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }
}