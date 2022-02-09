package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("privet");
        al.add("poka");
        al.add("ok");
        al.add("uchim java");
        al.add("a imenno lambdas");
//        al.removeIf(element -> element.length() < 5);
        Predicate<String> pr = e -> e.length() < 5;
        al.removeIf(pr);
        System.out.println(al);

    }


}
