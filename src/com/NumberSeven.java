package com.task1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberSeven {
    public static void main(String[] args) {
        List<Integer> kabisat = IntStream.rangeClosed(2000, 2020)
                .boxed().collect(Collectors.toList());
        System.out.println("==Number 7==");
        kabisat.stream().forEach(new TahunKabisat()::get);
    }

    public static class TahunKabisat {
        private void get(Integer years) {
            boolean kabisat = years % 4 == 0;
            if (kabisat) {
                System.out.println(years + " adalah tahun kabisat");
            } else {
                System.out.println(years + " bukan tahun kabisat");
            }
        }
    }
}
