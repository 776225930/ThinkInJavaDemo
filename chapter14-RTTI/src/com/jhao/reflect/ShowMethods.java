package com.jhao.reflect;

import com.jhao.typeinfo.Toy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * @author JiangHao
 * @date 2020/5/4
 * @describe
 */
 class ShowMethods {
    private static Pattern p = Pattern.compile("\\w+\\.");

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage :\n ...");
            System.exit(0);
        }
        int lines = 0;
        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getDeclaredMethods();
            Constructor<?>[] constructors = c.getDeclaredConstructors();
            if (args.length == 1) {
                for (Method method : methods) {
                    System.out.println(method.toString());
                    System.out.println("====" + p.matcher(method.toString()).replaceAll(""));
                }
                for (Constructor constructor : constructors) {
                    System.out.println(constructor.toString());
                    System.out.println("====" + p.matcher(constructor.toString()).replaceAll(""));
                }
            } else {
                for (Method method : methods) {
                    if (method.toString().indexOf(args[1]) != -1) {
                        System.out.println(p.matcher(method.toString()).replaceAll(""));
                        lines++;
                    }
                }
                for (Constructor constructor : constructors) {
                    if (constructor.toString().indexOf(args[1]) != -1) {
                        System.out.println(p.matcher(constructor.toString()).replaceAll(""));
                        lines++;
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
