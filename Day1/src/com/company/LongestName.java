package com.company;

public class LongestName {
    public static void main(String[] args) {
        String[] names = { "Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks" };
        int max_len = Integer.MIN_VALUE;
        String longStr = "";
        for(int i=0; i< names.length; i++){
            if (names[i].length() > max_len){
                max_len = names[i].length();
                longStr = names[i];
            }
        }
        System.out.println(longStr);
    }
}
