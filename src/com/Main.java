package com.task1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        numberOne();
        numberTwo();
        numberThree();
        numberFour();
        numberFive();
        numberSix();
        numberSeven();
        numberEight();
        numberNine();
        numberTen();
    }

    private static void numberOne() {
        int X = 64;
        int Y = 2;
        int penjumlahan = X + Y;
        int pengurangan = X - Y;
        int perkalian = X * Y;
        int perpangkatan = (int) Math.pow(X, Y);
        int pengakaran = (int) Math.sqrt(X);
        int pembagian = X / Y;
        System.out.println("==Number 1==");
        System.out.println("Hasil jumlah = " + penjumlahan);
        System.out.println("Hasil kurang = " + pengurangan);
        System.out.println("Hasil kali = " + perkalian);
        System.out.println("Hasil Perpangkatan = " + perpangkatan);
        System.out.println("Hasil sisa bagi = " + pengakaran);
        System.out.println("Hasil sisa bagi = " + pembagian);
    }

    private static void numberTwo() {
        System.out.println("==Number 2==");
        List<Integer> range = IntStream.rangeClosed(1, 1000)
                .boxed().collect(Collectors.toList());

        range.stream()
                .filter(Main::isPrime)
                .forEach(System.out::println);
    }

    private static boolean isPrime(Integer prime) {
        if (prime < 2) return false;

        for (int i = 2; i < prime; i++) {
            if (prime % i == 0) return false;
        }

        return true;
    }

    private static void numberThree() {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("\n==Number 3==");
        System.out.print("Masukkan sebuah bilangan : ");
        a = scan.nextInt();
        if (a % 2 == 0) {
            System.out.print("\n");
            if (a % 4 == 0) {
                System.out.println("Crucio Reducto");
            } else {
                System.out.println("Crucio\n");
            }
        }
        if (a % 2 == 1) {
            System.out.println("\n");
            if (a % 5 == 0) {
                System.out.println("Imperio Aberto");
            } else {
                System.out.println("Imperio\n");
            }
        }
    }

    private static void numberFour() {
        var list = List.of("Aku", "bukanlah", "Superman", "Aku", "juga", "bisa", "nangis");

        var listmerge = list.stream().distinct().collect(Collectors.joining(" "));
        System.out.println("==Number 4==");
        System.out.println(listmerge);
    }

    private static void numberFive() {
        var age = (int) (Math.random() * 29) + 1;
        System.out.println("==Number 5==");
        System.out.println(age);
        if (age >= 21) System.out.println("DEWASA");
        else if (age >= 13) System.out.println("REMAJA");
        else if (age >= 9) System.out.println("BIMBINGAN ORANG TUA");
        else System.out.println("SEMUA UMUR");
    }

    private static void numberSix() {
        int angka;
        System.out.println("===Number 6===");
        for (angka = 1; angka <= 200; angka++) {
            if (angka %5 ==0) {
                if (angka % 7 == 0) {
                    System.out.println(angka + " Angka Ganjil Kelipatan Tujuh \n");
                } else {
                    System.out.println(angka + " Angka Ganjil \n");
                }
            } else if (angka % 2 == 0) {
                if (angka % 100 == 0) {
                    System.out.println(angka + " Angka  Kelipatan Seratus \n");
                } else {
                    System.out.println(angka + " Angka Genap \n");
                }
            } else if (angka % 2 == 1) {
                if (angka % 7 == 0)
                    System.out.println(angka + " Angka Ganjil Kelipatan Tujuh \n");
            } else {
                System.out.println(angka + " Angka Genap \n");
            }

        }
    }

    private static void numberSeven() {
        int start = 1;
        int end = 4;
        System.out.println("===Number 7===");
        for (int years = start; years < end + 1; years++) {
            boolean kabisat = years % 4 == 0;
            if (kabisat) {
                System.out.println(years + " adalah tahun kabisat");
            } else {
                System.out.println(years + " bukan tahun kabisat");
            }
        }
    }

    private static void numberEight(){
        var numbers = List.of(3, 1, 7, 4, 5, 6, 8, 2);
        int Indexnumbers = numbers.get(0);
        for (Integer number : numbers) {
            if (Indexnumbers < number) {
                Indexnumbers = number;
            }
        }
        System.out.println("===Number 8===");
        System.out.println(numbers.stream().mapToInt(Integer::intValue).sum() - Indexnumbers+" List Numbers");
    }

    private static void numberNine(){
        Scanner scan = new Scanner(System.in);
        System.out.println("===Number 9===");
        System.out.print("Masukkan sebuah kata/kalimat: ");
        String str = scan.nextLine();

        int length = str.length();
        System.out.println("Length of a String is: " + length);
    }

    private static void numberTen(){
        var numbers = List.of(3, 1, 7, 4, 5, 6, 8, 2);
        var indices = List.of(8, 7, 2, 8, 2, 6);

        var merged = new ArrayList<>(numbers);
        merged.addAll(indices);
        System.out.println("===Number 10===");
        System.out.println(mergeArraysAndRemoveDuplicates(merged));
    }

    private static Set<Integer> mergeArraysAndRemoveDuplicates(List<Integer> listContainingDuplicates)
    {
        final Set<Integer> setToReturn = new HashSet<>();
        final Set<Integer> set1 = new HashSet<>();


        for (Integer yourInt : listContainingDuplicates) {
            if (!set1.add(yourInt)) {
                setToReturn.add(yourInt);
            }
        }
        return setToReturn;
    }
}