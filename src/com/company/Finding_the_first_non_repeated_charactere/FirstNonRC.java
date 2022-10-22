package com.company.Finding_the_first_non_repeated_charactere;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRC {
    public FirstNonRC(){
        throw new AssertionError("can't be instantiated ");
    }

    public static char findFirstNonRepeatedCharacter(String str ){
    if( str==null || str.isEmpty()){
        throw new IllegalArgumentException("string should not be empty");
    }

        for (int i=0 ;i<str.length();i++){
            char ch= str.charAt(i);
            int count =0;
            for (int j=0 ; j<str.length();j++){
                if(ch == str.charAt(j) && i!=j){
                    count++;
                    break;
                }
            }
            if (count==0) return ch;
        }
        return Character.MIN_VALUE;
    }
    public static char findFirstNonRepeatedCharacterV2(String str ) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("string should not be empty");
        }
        Map<Character,Integer> chars=new HashMap<>();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            chars.compute(ch,(k, v) -> (v==null)? 1:v++ );
        }
        for (Map.Entry<Character,Integer> entry : chars.entrySet()) {
            if (entry.getValue()==1){
                return entry.getKey();
            }

        }
        return Character.MIN_VALUE;
    }
}

