package com.green.java.ch02;

public class StringQuiz1 {
    public static void main(String[] args) {
        String fullfileNm = "newjeans.jpg";
        String fileNm, ext;

        fileNm=fullfileNm.substring(0,fullfileNm.length()-4);
        ext=fullfileNm.substring(fullfileNm.length()-3);
        System.out.println(fileNm);
        System.out.println(ext);

        fileNm=fullfileNm.substring(0,fullfileNm.indexOf("."));
        ext=fullfileNm.substring(fullfileNm.indexOf(".")+1);
        System.out.println(fileNm);
        System.out.println(ext);
    }
}
