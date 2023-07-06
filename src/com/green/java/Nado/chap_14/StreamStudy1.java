package com.green.java.Nado.chap_14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamStudy1 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 3, 4, 5);
        Stream<Integer> intStream = intList.stream();
        intStream.forEach(System.out::println);

        System.out.println("-----------");
        intList.stream()
                .distinct()
                .forEach(item -> {
            System.out.println(item + ", ");
        });

        System.out.println("-----------");
        int[] intArr = {9, 11, 22, 3, 4, 5, 100};
        IntStream intArrStream = Arrays.stream(intArr);
        intArrStream.sorted().forEach(System.out::println);
        System.out.println(Arrays.toString(intArr));
    }
}
