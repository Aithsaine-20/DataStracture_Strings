package com.company.Counting_duplicate_characters;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

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
}
