package nyc.c4q.poojawins;

import java.util.ArrayList;

public class LinearSearch {

    public static void main(String[] args) {
        ArrayList<Integer> thing = new ArrayList<Integer>();
        thing.add(1);
        thing.add(4);
        thing.add(8);
        thing.add(7);
        thing.add(2);
        thing.add(9);

        System.out.println(search(thing, 2));
        System.out.println(search(thing, 3));
    }

    public static int search(ArrayList<Integer> alist, int x) {
          return alist.indexOf(x);
    }
}
