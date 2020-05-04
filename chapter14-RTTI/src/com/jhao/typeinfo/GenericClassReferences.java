package com.jhao.typeinfo;

/**
 * @author JiangHao
 * @date 2020/5/3
 * @describe
 */
public class GenericClassReferences {
    public static void main(String[] args) {
        Class integerClass = int.class;
        Class<Integer> genericClass = int.class;
        integerClass = double.class;
//        genericClass = double.class;
        Class<Integer> integerClass1 = Integer.class;
    }
}
