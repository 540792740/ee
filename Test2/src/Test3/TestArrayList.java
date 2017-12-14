package Test3;

import java.util.Iterator;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<String> myList = new java.util.ArrayList<>();
        List<Integer> a = new java.util.ArrayList<>();
        for(int i = 0; i < 10; i++){
            a.add(i);
        }
        int sum = 0;
        for(Iterator<Integer> b = a.listIterator();
                b.hasNext();) {
            if (b.next() != 8 || b.next() != 9 ) {
                sum += b.next();
            }
        }
        System.out.println(sum);
    }
}
