package com.dsa.leet.string;

public class ConvertToTitle {
    public static void main(String[] args) {
        System.out.println(convertToTitle(28));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder sb =new StringBuilder();

        while (columnNumber >0){
            int num = (columnNumber -1) % 26;
            sb.append((char)(num+ 'A'));
            columnNumber = (columnNumber-1)/26;
        }

        return sb.reverse().toString();
    }



}


