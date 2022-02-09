package collections;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.set(2, "Nikita");
        arrayList1.set(2, "Misha");
        arrayList1.set(1, "Vova");
        for (String s : arrayList1) {
            System.out.println(s);
        }
//        for (int i = 0; i < arrayList1.size(); i++) {
//            System.out.println(arrayList1.get(i));
//        }

    }
}
