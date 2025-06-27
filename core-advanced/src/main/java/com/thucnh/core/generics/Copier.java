package com.thucnh.core.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Copier {
    public static <T> void copy(Collection< ? super T> desc, Collection< ? extends T> src){
       for (T t : src) {
           desc.add(t);
       }
    }
    public static List<Integer> filterEven(Collection<? extends Number> listNumber){
       List<Integer> listEven = new ArrayList<>();
        for (Number number : listNumber) {
            if(number.intValue() % 2 == 0){
                listEven.add(number.intValue());
            }
        }
        return listEven;
    }
    public static void main(String[] args) {
        List<Integer> src = List.of(1, 2, 3, 4, 5);
        List<Number> dest = new ArrayList<>();
        copy(dest, src);
        System.out.println(dest); // [1, 2, 3]
        System.out.printf("filterEven: ");
        List<Double> input = List.of(2.0, 3.0, 4.0, 5.0);
        System.out.println(filterEven(input)); // [2, 4]
    }
}
