package com.jhao.typeinfo;

import java.util.Random;

/**
 * @author JiangHao
 * @date 2020/5/3
 * @describe
 */
class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitializatrion.random.nextInt(1000);

    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2 {
    static int staticNonFinal = 147;

    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3 {
    static  int staticNonFinal = 74;

    static {
        System.out.println("Initializing Initable3");
    }
}

public class ClassInitializatrion {
    public static Random random = new Random(47);

    public static void main(String[] args) throws ClassNotFoundException {
        Class initableClass = Initable.class;//不会触发类的初始化
        System.out.println("After creating Initable ref");
        //Dose not trigger initialization:
        System.out.println(Initable.staticFinal);//static final 如果是已经给定确定的值（编译期常量0） 不需要对类进行初始化就可以引用
        System.out.println("After Initable.staticFinal");
        //Dose trigger initialization:
        System.out.println(Initable.staticFinal2);
        //Dose trigger initialization:
        System.out.println(Initable2.staticNonFinal);
        Class.forName("com.jhao.typeinfo.Initable3");
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);
    }
}
