public class Test200 {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("privet");
        System.out.println(info1);
        Info<Integer> info2 = new Info<>(1425512);
        System.out.println(info2);
        String s = info1.getValue();
        System.out.println(s);
    }
}

class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "<<>" + value + "<>>";
    }

    public T getValue() {
        return value;
    }
}
