package com.company;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringWithFirstLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        //firstly create the object of stringtoknizer
        StringTokenizer st = new StringTokenizer(s1);
        //to iterate over broken strings use that do tokenizer has more tokens
        String out = "";
        while(st.hasMoreTokens()){
            //point tokenizer to next token
            String k=st.nextToken();
            out = out + k.charAt(0);
        }
        System.out.println(out);
    }
}
