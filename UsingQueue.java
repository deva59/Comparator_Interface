package Comparator_Interface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class UsingQueue{
    public static void main(String[] args) {
        Comparator<Integer> ff = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if (i > j)
                    return 1;
                else
                    return -1;
            }
        };

        List<Integer> dd = new ArrayList<>(){
            dd.add(1);

    }
}