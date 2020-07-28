package com.task1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberTwo {
    public static void main(String[] args) {
        System.out.println("==Number 2==");
        List<Integer> range = IntStream.rangeClosed(1, 1000)
                .boxed().collect(Collectors.toList());

        range.stream()
                .filter(NumberTwo::isPrime)
                .forEach(System.out::println);
    }

    private static boolean isPrime(Integer prime) {
        if (prime < 2) return false;

        for (int i = 2; i < prime; i++) {
            if (prime % i == 0) return false;
        }

        return true;
    }
}
