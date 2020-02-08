package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Ivan");
        al.add("Petr");
        al.add("Alex");
        al.add("Max");
        al.add("Dmitry");

        Comparator<String> sort_type = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int val = o1.length() - o2.length();
                return val;
            }
        };

        Collections.sort(al,sort_type);
        for(String s: al) {
            System.out.print(s + " ");
        }



    }
}
