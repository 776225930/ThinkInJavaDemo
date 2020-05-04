package com.jhao.typeinfo;

/**
 * @author JiangHao
 * @date 2020/5/3
 * @describe
 */

interface HasBarrier {
}

interface Waterproof {
}

interface Shoots {
}

public class Toy {
    public Toy() {
    }

    public Toy(int i) {
    }

}

class FancyToy extends Toy implements HasBarrier, Waterproof, Shoots {
    public FancyToy() {
        super(1);
    }
}

class ToyTest {
    static void printInfo(Class clazz) {
        System.out.println("Class name : " + clazz.getName() + " is interface ? [" + clazz.isInterface() + "]");
        System.out.println("simple name : " + clazz.getSimpleName());
        System.out.println("Canonical name : " + clazz.getCanonicalName());
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class c = null;
        try {
            c = Class.forName("com.jhao.typeinfo.FancyToy");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        printInfo(c);
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        printInfo(obj.getClass());

//        Class<FancyToy> fancyToyClass = FancyToy.class;
//        Class<? super FancyToy> superclass = fancyToyClass.getSuperclass();
//        Object object = superclass.newInstance();
    }

}