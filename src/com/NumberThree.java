package com.task1;

public class NumberThree {
    public static void main(String[] args) {
        Even oddeven = new Even();
        System.out.println(oddeven.get(8));
    }

    public static class Even {
        public String get(int a) {
            String result = "";
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
            return result;
        }
    }
}
