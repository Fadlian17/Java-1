package com.task1;

import java.util.Scanner;

public class NumberNine {
    public static void main(String[] args) {
        CountCharacter Words = new CountCharacter();
        String hitungs = "ilmiah";
        System.out.println(Words.Words(hitungs));
    }

    public static class CountCharacter{
        private String Words(String hitungs) {
            Scanner scan = new Scanner(System.in);
            System.out.println("===Number 9===");
            System.out.print("Masukkan sebuah kata/kalimat: ");
            String str = scan.nextLine();

            int length = str.length();
            System.out.println("Length of a String is: " + length);

            return str;
        }
    }
}
