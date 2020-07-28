package com.task1;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NumberFour {
    public static void main(String[] args) {

        var list = List.of("Aku", "bukanlah", "Superman", "Aku", "juga", "bisa", "nangis");

        var listmerge = list.stream().distinct().collect(Collectors.joining(" "));

        System.out.println(listmerge);
    }
}
