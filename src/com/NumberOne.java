package com.task1;

import java.util.Scanner;

public class NumberOne {

    public static void main(String[] args) {
        // write your code here
        int X = 64;
        int Y = 2;

        System.out.println("==Number 1==");
        System.out.println("Hasil jumlah dari " + X + " dan " + Y + " adalah" + Aritmatika.Penjumlahan(X, Y));
        System.out.println("Hasil kurang  dari " + X + " dan " + Y + " adalah" + Aritmatika.Pengurangan(X, Y));
        System.out.println("Hasil kali dari " + X + " dan " + Y + " adalah" + Aritmatika.Perkalian(X, Y));
        System.out.println("Hasil Perpangkatan dari " + X + " dan " + Y + " adalah" + Aritmatika.Perpangkatan(X, Y));
        System.out.println("Hasil Pengakaran dari " + X + Y + " dan " + " adalah" + Aritmatika.Pengakaran(X, Y));
        System.out.println("Hasil Pembagian dari " + X + " dan " + Y + " adalah" + Aritmatika.Pembagian(X, Y));
    }

    private static class Aritmatika {
        public static int Penjumlahan(int x, int y) {
            return Math.addExact( x ,y);
        }

        public static int Pengurangan(int x, int y) {
            return Math.subtractExact(x,y);
        }

        public static double Perpangkatan(int x, int y) {
            int pangkat = (int) Math.pow(x, y);
            return pangkat;
        }

        public static String Pengakaran(int x, int y) {
            var akarx = (int) Math.sqrt(x);
            var akary = (int) Math.sqrt(y);
            return "Akar dari " + x + " adalah " + akarx + "\nAkar dari " + y + " adalah " + akary;
        }

        public static int Pembagian(int x, int y) {
            return Math.floorDiv(x ,y);
        }

        public static int Perkalian(int x, int y) {
            return Math.multiplyExact(x,y);
        }
    }
}
