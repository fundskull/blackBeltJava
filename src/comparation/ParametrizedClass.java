package comparation;

public class ParametrizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("privet");
        System.out.println(info1);
        Info<Integer> info2 = new Info<>(5);
        System.out.println(info2);
        Info<Bus> info3 = new Info<>(new Bus());
        System.out.println(info3);
        info3.getValue();

    }
}

class Info <T>{
    private T value;

    public Info (T value) {
        this.value = value;
    }

    public String toString() {
        return "{[ " + value + " ]}";
    }

    public T getValue() {
        return value;
    }
}

class Bus1 {}