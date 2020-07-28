package com.task1;

import java.util.Scanner;

public class NumberNine {
    public static void main(String[] args) {

        System.out.println("===Number 9===");
        System.out.print("Masukkan sebuah kata/kalimat:");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println("Length of a String is: " + CountCharacter(str));
    }

    public static int CountCharacter(String hitungs) {

        int i = 0;
        for (char c : hitungs.toCharArray()) {
            i++;
        }
        return i;
    }
}
