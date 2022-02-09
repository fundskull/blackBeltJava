package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Zaur");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");
//        set.add(null);
        set.remove("Zaur");
        System.out.println(set.size());
//        System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(5);
        set1.add(2);
        set1.add(3);
        set1.add(1);
        set1.add(8);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(7);
        set2.add(4);
        set2.add(3);
        set2.add(5);
        set2.add(8);
        HashSet<Integer> union = new HashSet<>(set1);
//        union.addAll(set2);
//        System.out.println(union);
//        union.retainAll(set2);
//        System.out.println(union);
        union.removeAll(set2);
        System.out.println(union);



    }
}
