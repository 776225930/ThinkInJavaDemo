package com.jhao.stringdemo;

/**
 * @author JiangHao
 * @date 2020/5/2
 * @describe
 */
public class WhiterStringBuilder {

    public String implicit(String[] fields) {
        String result = "";
        //每次循环会自动创建一个StringBuilder
        for (int i = 0; i < fields.length; i++) {
            result += fields[i];
        }
        return result;
    }

    public String explicit(String[] fields) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            builder.append(fields[i]);
        }
        return builder.toString();
    }
}
