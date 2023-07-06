package com.green.java.Nado.chap_14;

import java.util.stream.Stream;

public class StreamStudy3 {
    public static void main(String[] args) {
        Stream<Integer> evenStream = Stream.iterate(0, n -> n + 2);
        evenStream.limit(1000).forEach(System.out::println);
    }
}
