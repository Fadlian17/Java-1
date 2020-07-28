package com.task1;

import java.util.Collections;
import java.util.List;

public class NumberEight {
    public static void main(String[] args) {
        HitungAngka hitung = new HitungAngka();
        List<Integer> list = List.of(3, 1, 7, 4, 5, 6, 8, 2);
        System.out.println("===Number 8===");
        System.out.println(hitung.TanpaTerbesar(list)+" List Numbers");
    }

    public static class HitungAngka {
        private int TanpaTerbesar(List<Integer> hitungs) {
            int sum, max;
            max = Collections.max(hitungs);
            sum = hitungs.stream().reduce(0, Integer::sum) - max;
            return sum;
        }
    }
}
