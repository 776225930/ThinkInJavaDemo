package com.jhao.typeinfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JiangHao
 * @date 2020/5/3
 * @describe
 */

class CountedInteger {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return Long.toString(id);
    }
}

public class FillList<T> {

    private Class<T> type;

    public FillList(Class<T> type) {
        this.type = type;
    }

    public List<T> create(int elements) {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            try {
                list.add(type.newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public static void main(String[] args) {
        FillList<CountedInteger> fillList = new FillList<>(CountedInteger.class);
        System.out.println(fillList.create(5));
    }
}
