package com.company;

import java.util.Scanner;

public class CountCamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        for(int i=0; i < str.length(); i++){
            if (str.charAt(i)<97){
                count++;
            }
        }
        System.out.println(count);
    }
}
