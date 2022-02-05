package comparation;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
//        list.add("hello");
//        list.add(4);
//        list.add(new StringBuilder());
        list.add("privet");
        list.add("poka");
//        list.add(new StringBuilder("5"));

        for (Object s : list) {
            System.out.println((String) s);
            System.out.println(((String) s).length());
        }
    }
}
