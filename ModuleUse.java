package Comparator_Interface;

import java.util.*;

public class ModuleUse {
    public static void main(String[] args) {
        Comparator<Integer> kk = new Comparator<>() {
            @Override
            public int compare(Integer i, Integer j) {
                //Using Module Compare two Element on Last Digit.
                if (i%10  > j%10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        ArrayList<Integer> jk = new ArrayList<>();

        jk.add(100);
        jk.add(202);
        jk.add(214);
        jk.add(303);

        Collections.sort(jk, kk);
        System.out.println(jk);


    }
}
