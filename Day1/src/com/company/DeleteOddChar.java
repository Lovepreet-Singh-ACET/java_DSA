package com.company;

import java.util.Scanner;

public class DeleteOddChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String new_str = "";
        for(int i=0; i<str.length(); i++){
            if (i%2==0){
                new_str = new_str + str.charAt(i);
            }
        }
        System.out.println(new_str);
    }
}
