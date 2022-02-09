package lambda;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("privet");
        al.add("poka");
        al.add("kak dela?");

        Iterator<String> iterator = al.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
