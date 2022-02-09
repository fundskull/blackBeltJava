package comparation;

import java.util.ArrayList;

public class ParametrizedClass3 {
    public static void main(String[] args) {
        ArrayList<String> arrayListOfStrings = new ArrayList<>();
        arrayListOfStrings.add("privet");
        arrayListOfStrings.add("kak dela?");
        arrayListOfStrings.add("poka");
        ArrayList<Integer> arrayListOfIntegers = new ArrayList<>();
        arrayListOfIntegers.add(2);
        arrayListOfIntegers.add(5);
        arrayListOfIntegers.add(12);
        String a = GenericMethod.getSecondValue(arrayListOfStrings);
        int b = GenericMethod.getSecondValue(arrayListOfIntegers);
        System.out.println(a);
        System.out.println(b);
    }
}

class GenericMethod {
    public static <T> T getSecondValue(ArrayList<T> al) {
        return al.get(1);
    }
}
