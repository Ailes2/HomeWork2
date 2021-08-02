package com.company;

public class StrReplace {
    public static void main(String[] args) {
        String s = "Qwerty12345";


        System.out.println(replace(s));
    }

    public static String replace(String s){
        String newstring = s.replace("123", "");
        return newstring;

    }



}
//