package com.thucnh.core.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListUtils {
    public static <T> void printList(List<T> list){
        for (T t : list) {
            System.out.println(t);
        }
    }
    public static <T,R> List<R> fromArrayToList(T [] arr, Function<T,R> func){
       return Arrays.stream(arr).map(func).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        ListUtils.printList(list);
        String[] words = {"Java", "Generics", "Rules"};
        List<Integer> lengths = fromArrayToList(words, String::length);
        System.out.println(lengths); // [4, 8, 5]

    }
}
