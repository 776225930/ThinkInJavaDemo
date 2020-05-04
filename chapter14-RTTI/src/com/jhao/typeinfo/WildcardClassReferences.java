package com.jhao.typeinfo;

/**
 * @author JiangHao
 * @date 2020/5/3
 * @describe
 */
public class WildcardClassReferences {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        System.out.println(intClass == Integer.TYPE);//true
        intClass = double.class;
        System.out.println(intClass);

    }
}
