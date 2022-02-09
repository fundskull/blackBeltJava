package comparation;

import java.util.ArrayList;
import java.util.List;

public class Test15 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(3.14);
        list.add(3.15);
        list.add(3.16);
//        showListInfo(list);
//        List<String> list2 = new ArrayList<>();
//        list2.add("privet");
//        list2.add("kak dela?");
//        list2.add("poka");
//        showListInfo(list2);
        System.out.println(sumNumberArray(list));
    }

    static void showListInfo(List<?> list) {
        System.out.println("Мой лист содержит следующие элементы: \n" + list);
    }

    public static double sumNumberArray(ArrayList<? extends Number> list) {
        double sum = 0;
        for (Number a : list) {
            sum += a.doubleValue();
        }
        return sum;
    }
}
