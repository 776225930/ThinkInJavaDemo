package com.jhao.typeinfo;

/**
 * @author JiangHao
 * @date 2020/5/3
 * @describe
 */

class Building {
}

class House extends Building {
}

public class ClassCasts {

    public static void main(String[] args) {
        Building house = new House();
        Class<House> houseType = House.class;
        House house1 = houseType.cast(house);
        System.out.println();
        house1 = (House) house;
    }
}
