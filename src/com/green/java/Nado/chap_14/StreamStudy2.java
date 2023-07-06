package com.green.java.Nado.chap_14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamStudy2 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 3, 4, 5);
        List<Integer> resultList = intList.stream()
                .distinct()
                .skip(2)
                .limit(3).toList();

        System.out.println(intList);
        System.out.println(resultList);

        System.out.println("-------------");
        IntStream.range(1, 5).forEach(System.out::println);
    }
}
