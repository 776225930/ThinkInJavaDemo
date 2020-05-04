package com.jhao.typeinfo.pets;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author JiangHao
 * @date 2020/5/4
 * @describe
 */
public class PetCounts3 {
    static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer> {
        public static Map<Class<? extends Pet>, Integer> linkedHashMap;

        static {
            linkedHashMap = new LinkedHashMap();
            for (Class<? extends Pet> clazz : LiteralPetCreator.allTypes) {
                linkedHashMap.put(clazz, 0);
            }
        }

        public PetCounter() {
            super(linkedHashMap);
        }

        public void count(Pet pet) {
            for (Map.Entry<Class<? extends Pet>, Integer> entry : entrySet()) {
                if (entry.getKey().isInstance(pet)) {
                    put(entry.getKey(), entry.getValue() + 1);
                }
            }
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder("{");
            for (Map.Entry<Class<? extends Pet>, Integer> pair
                    : entrySet()) {
                result.append(pair.getKey().getSimpleName());
                result.append("=");
                result.append(pair.getValue());
                result.append(", ");
            }
            result.delete(result.length() - 2, result.length());
            result.append("}");
            return result.toString();
        }
    }

    public static void main(String[] args) {
        PetCounter counter = new PetCounter();
        for (Pet pet : Pets.createArray(20)) {
            counter.count(pet);
        }
        System.out.println();
        System.out.println(counter);
    }

}
