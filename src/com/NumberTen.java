package com.task1;

import java.util.List;
import java.util.stream.Collectors;

public class NumberTen {
    public static void main(String[]args){
        var s1 = List.of(3,1,7,4,5,6,8,2);
        var s2 = List.of(8,7,2,8,2,6);

        System.out.println("==Number 10==");
        System.out.println(Slice.get(s1,s2));
    }

    public static class Slice{
        private static List<Integer> get(List listFirst, List listSecond)
        {
            return (List<Integer>) listFirst.stream().filter(listSecond::contains).collect(Collectors.toList());
        }
    }
}
