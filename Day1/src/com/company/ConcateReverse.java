package com.company;

import java.util.Scanner;

public class ConcateReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        str1 = str1.concat(str2);
        String rev = "";
        for(int i= str1.length() -1 ; i>=0; i--){
            rev = rev + str1.charAt(i);
        }
        System.out.println(rev);
    }
}
