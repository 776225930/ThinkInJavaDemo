package com.jhao.typeinfo;

/**
 * @author JiangHao
 * @date 2020/5/3
 * @describe
 */
public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
            Class<?> aClass = Class.forName("com.jhao.typeinfo.Gum");
            Object instance = aClass.newInstance();
            System.out.println(instance);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");
        //inside main
        //loading Candy
        //After creating Candy
        //loading Gum
        //After Class.forName("Gum")
        //loading Cookie
        //After creating Cookie


    }
}

class Candy {
    static {
        System.out.println("loading Candy");
    }
}

class Gum {
    static {
        System.out.println("loading Gum");
    }
}

class Cookie {
    static {
        System.out.println("loading Cookie");
    }
}

