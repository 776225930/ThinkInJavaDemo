package com.jhao.stringdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JiangHao
 * @date 2020/5/2
 * @describe
 */
public class InfiniteRecursion {
    @Override
    public String toString() {
        //java.lang.StackOverflowError
//        return "InfiniteRecursion address is " + this;
        return "InfiniteRecursion address is " + super.toString();
    }

    public static void main(String[] args) {

        List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
        for (int i = 0; i < 10; i++) {
            v.add(new InfiniteRecursion());
        }
        System.out.println(v);

    }
}
