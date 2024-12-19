package Comparator_Interface;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

class UsingQueue{
    public static void main(String[] args) {
        Comparator<Integer> ff = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if (i%10 > j%10)
                    return 1;
                else
                    return -1;
            }

        };

        List<Integer> dd = new ArrayList<>();
            dd.add(17);
            dd.add(21);
            dd.add(39);
            dd.add(43);

         Collections.sort(dd, ff);
        System.out.println(dd);
    }
}