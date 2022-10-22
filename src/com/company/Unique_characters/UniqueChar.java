package com.company.Unique_characters;

import java.util.HashMap;
import java.util.Map;

public class UniqueChar {
    private static final int MAX_CODE=65535;

    void UniqueChar(){
        throw new AssertionError("can not be intantiated");

    }
    // string = "ihcham do thinks"
    // return true
    public static boolean  findUniqueChar(String str){
        if (str==null|| str.isEmpty()){
            throw new IllegalArgumentException("the phrase should not be empty ");
        }

        Map<Character,Boolean> chars = new HashMap<>();

        for (int i=0;i<str.length();i++){
            if (str.codePointAt(i) <= MAX_CODE){
                char ch=str.charAt(i);
                if (!Character.isWhitespace(ch)) {
                    if (chars.put(ch, true) != null) {
                        return false;
                    }

                }else return false;
            }
            return true;
        }
        return true;
    }


}
