package com.jhao.stringdemo;


import java.util.regex.Pattern;

/**
 * @author JiangHao
 * @date 2020/5/3
 * @describe
 */
public class Replacing {

    static String s = Splitting.knights;

    public static void main(String[] args) {
        System.out.println(s.replaceFirst("f\\w+", "located"));
        System.out.println(s.replace("f\\w+", "located"));
        System.out.println(s.replaceAll("shrubbery|tree|herring", "apple"));

    }
}
