package com.company;

import java.util.Scanner;

public class LowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str_lower = "";
        for(int i=0; i<str.length(); i++){
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90){
                str_lower = str_lower + (char)(str.charAt(i)+32);
            }
            else{
                str_lower = str_lower + str.charAt(i);
            }
        }
        System.out.println(str_lower);
    }
}
