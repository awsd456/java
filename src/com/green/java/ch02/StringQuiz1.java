package com.green.java.ch02;

public class StringQuiz1 {
    public static void main(String[] args) {

        String fullfileNm = "newjeans.poster.old.jpg";
        String fileNm, ext;


        fileNm = fullfileNm.substring(0, fullfileNm.indexOf("."));
        System.out.println(fileNm);
        ext = fullfileNm.substring(fullfileNm.lastIndexOf(".") + 1);
        System.out.println(ext);


    }
}
