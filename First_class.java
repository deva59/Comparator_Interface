package Comparator_Interface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.*;

class First_class {
    public static void main(String[] args) {
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if (i > j) {
                    return 1;
                } else {
                    return -1;
                }
            }
            };



           List<Integer> l1 = new ArrayList<>();
            l1.add(1);
            l1.add(2);
            l1.add(3);
            l1.add(4);
            l1.add(5);

        Collections.sort(l1, comp);
        System.out.println(l1);
        }
    }


