package com.task1;

import java.util.Scanner;

public class NumberFive {
    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan sebuah Rating : ");
        a = scan.nextInt();
        if (a >=21) {
            System.out.print("Rating Dewasa");
        }else if(a>=18) {
            System.out.print("Rating Remaja");
        }else if (a >=9){
            System.out.print("Rating Bimbingan Orang Tua");
        }else {
            System.out.print("Rating Semua Usia");
        }
    }
}
