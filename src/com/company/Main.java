package com.company;

import com.company.Counting_duplicate_characters.CountingDC;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

public class Main {
    private static final String TEXT="I'm Hicham ait hsaine ";
    public static void main(String[] args) {
        System.out.println("input text \n" +TEXT +"\n");
        long startTimeV =System.nanoTime();
        Map<Character,Integer> duplicate = CountingDC.countingDuplicateCharacters(TEXT);

        System.out.println(System.nanoTime()-startTimeV);
        System.out.println(Arrays.toString(duplicate.entrySet().toArray()));


    }
}
