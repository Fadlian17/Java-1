package com.task1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberSix {
    public static void main(String[] args) {
        List<Integer> range = IntStream.rangeClosed(1,200)
                .boxed().collect(Collectors.toList());

        range.forEach(new GanjilGenap()::check);

    }

    public static class GanjilGenap {
        private boolean check(int angka) {
            if (angka % 100 == 0) {
                    System.out.println(angka + " Kelipatan Seratus \n");
                } else if(angka %2 ==0){
                if(angka%8 == 0){
                    System.out.println(angka + " Angka Genap dan kelipatan Delapan \n");
                }else{
                    System.out.println(angka + " Angka Genap \n");
                }
            } else if (angka % 2 == 1)
                if (angka % 7 == 0)
                    System.out.println(angka + " Angka Ganjil Kelipatan Tujuh \n");
             else {
                System.out.println(angka + " Angka Ganjil \n");
            }
            return true;
        }
    }
}
