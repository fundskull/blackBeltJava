package lambda;

public class Test2 {
    static void info(TestInterface testInterface) {
        System.out.println(testInterface.abc("poka", 20));
    }

    public static void main(String[] args) {
        info((x,y) -> x.length() + y);
    }


}

interface TestInterface {
    int abc(String s, int a);
}
