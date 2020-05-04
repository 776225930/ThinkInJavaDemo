package com.jhao.typeinfo.pets;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author JiangHao
 * @date 2020/5/4
 * @describe
 */
public class Pets {

    public static final PetCreator creator = new LiteralPetCreator();

    public static final Pet randomPet() {
        return creator.randomPet();
    }

    public static Pet[] createArray(int size) {
        return creator.createArray(size);
    }

    public ArrayList<Pet> arrayList(int size) {
        return creator.arrayList(size);
    }

}
