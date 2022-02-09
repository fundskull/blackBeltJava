package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> nonSortedMap = Map.of(
                "One", 1,
                "Five", 5,
                "Three", 3,
                "Two", 2,
                "Four", 4
        );

        for (Map.Entry<String, Integer> entry : nonSortedMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        Map<String, Integer> sortedMap = sortByValue(nonSortedMap);

        sortedMap.entrySet().forEach(System.out::println);

        nonSortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

    }

    static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        TreeMap<String, Integer> temp = new TreeMap<>(new SortingMyMap(map));
        temp.putAll(map);
        return temp;
    }
}

class SortingMyMap implements Comparator<String> {
    private final Map<String, Integer> map;

    public SortingMyMap(Map<String, Integer> map) {
        this.map = map;
    }

    public int compare(String s1, String s2) {
        return map.get(s1) - map.get(s2);
    }

}
