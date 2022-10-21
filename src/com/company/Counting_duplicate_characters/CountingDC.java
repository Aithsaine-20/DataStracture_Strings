package com.company.Counting_duplicate_characters;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountingDC {
    public CountingDC() {
        throw  new AssertionError("cannt be instantiated");
    }

    public static Map<Character,Integer> countingDuplicateCharacters(String str){
        if (str==null || str.isEmpty()){
            //throw new IllegalArgumentException("string shoud not be empty");
            return Collections.emptyMap();
        }
        Map<Character,Integer> result=new HashMap<>();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            result.compute(ch,(k,v) -> (v==null)? 1 :++v);

        }
        return result ;

    }
    public static Map<String,Integer> countingDuplicateCharactersV2(String str){

        if(str ==null || str.isEmpty()){
            throw new IllegalArgumentException("string shoud not be empty");
        }
        Map<String,Integer> result=new HashMap<>();
        for (int i=0 ; i <str.length();i++){
            int cp = str.codePointAt(i);
            String ch2 =String.valueOf(Character.toChars(cp));
            if (Character.charCount(cp)==2 ){
                i++;
            }
            result.compute(ch2, (k,v ) -> (v==null)? 1 : ++v );

        }
        return result;
    }
    public static Map<Character,Long> countingDuplicateCharactersV3(String str ){

        if(str ==null || str.isEmpty()){
            throw new IllegalArgumentException("string shoud not be empty");

        }
        Map<Character,Long> result = str.chars().mapToObj( c -> (char) c ).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return result;
    }
}
