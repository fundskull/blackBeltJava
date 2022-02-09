package lambda;

import java.lang.annotation.Inherited;
import java.util.LinkedList;

public class Examp {
    String name;
    String date;
    int mark;

    public Examp(String name, String date, int mark) {
        this.name = name;
        this.date = date;
        this.mark = mark;
    }

    public static void main(String[] args) {
        Examp examp1 = new Examp("1", "04.05.2202", 5);
        Examp examp2 = new Examp("1", "04.05.2202", 5);
        System.out.println(examp1.equals(examp2));

        LinkedList<String> list = new LinkedList<>();
        list.get(0);
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (this == o) {
            return true;
        }
        Examp examp = (Examp) o;
        return mark == examp.mark && examp.name.compareTo(name) && examp.date.compareTo(date));


    }
}
