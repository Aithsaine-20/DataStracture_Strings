package com.company.Encoding_strings;

public class EncodingStr {

    //char[] str = "hicham ait hsaine" ---> str2= "hicham%20ait20%hsaine%20// "
    //count the str whitespases
    // creeat a new char[] with a length of str.length +2*countingSpaces
    public EncodingStr(){
        throw new AssertionError("can be instantiated");

    }
    public static char[] encodingStr(char[] str){

        if (str==null){
            throw new IllegalArgumentException("string should not be empty ");
        }


        //step 1 : counte whiteSpaces
        int counteWhiteSpaces= 0;
        for (int i=0;i<str.length;i++) {
            if (Character.isWhitespace(str[i])) {
                counteWhiteSpaces++;
            }
        }


        if(counteWhiteSpaces>0){
            //step2 create a new char[]
            char[] encodeStr =new char[str.length+2*counteWhiteSpaces];
            int index =0;
            for (int i=0;i<str.length;i++) {
                if(Character.isWhitespace(str[i])){
                    encodeStr[index]='%';
                    encodeStr[index+1]='2';
                    encodeStr[index+3]='0';
                    index=3;
                }
                else {
                    encodeStr[index]=str[i];
                    index++;
                }
            }
            return encodeStr;

        }else {
            return str;
        }
    }
}





