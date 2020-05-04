package com.jhao.typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JiangHao
 * @date 2020/5/3
 * @describe
 */
public class ForNameCreator extends PetCreator {

    private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();



    private static String[] typeNames = {
            "com.jhao.typeinfo.pets.Mutt",
            "com.jhao.typeinfo.pets.Pug",
            "com.jhao.typeinfo.pets.EgyptianMau",
            "com.jhao.typeinfo.pets.Manx",
            "com.jhao.typeinfo.pets.Cymric",
            "com.jhao.typeinfo.pets.Rat",
            "com.jhao.typeinfo.pets.Mouse",
            "com.jhao.typeinfo.pets.Hamster"
    };

    @SuppressWarnings("unchecked")
    private static void loader() {
        for (String name : typeNames) {
            try {
                types.add((Class<? extends Pet>) Class.forName(name));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    static {
        loader();
    }
    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
