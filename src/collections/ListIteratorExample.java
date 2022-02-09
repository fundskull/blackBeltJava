package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "aboba";
        List<Character> list = new LinkedList<>();
        for (char c : s.toCharArray()) {
            list.add(c);
        }
        System.out.println(list);
        ListIterator<Character> listIterator1 = list.listIterator();
        ListIterator<Character> reversedListIterator1 = list.listIterator(list.size());
        boolean isPalindrom = true;
        while(listIterator1.hasNext() && reversedListIterator1.hasPrevious()) {
            if (listIterator1.next() != reversedListIterator1.previous()) {
                isPalindrom = false;
                break;
            }
        }
        if (isPalindrom) {
            System.out.println("it's palindrom");
        } else {
            System.out.println("it's not palindrom");
        }
    }
}

