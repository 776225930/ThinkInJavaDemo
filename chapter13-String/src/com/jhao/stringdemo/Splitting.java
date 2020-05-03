package com.jhao.stringdemo;

import java.util.Arrays;

/**
 * @author JiangHao
 * @date 2020/5/3
 * @describe
 */
public class Splitting {

    public static String knights = "Then, when you have found shrubbery , you must " +
            "cut down the mightiest tree in the forest ...";

    public static void split(String regex) {
        System.out.println(Arrays.toString(knights.split(regex,0)));
    }

    public static void main(String[] args) {

        split(" ");//按空格划分 [Then,, when, you, have, found, shrubbery, ,, you, must, cut, down, the, mightiest, tree, in, the, forest, ...]
        split("\\W+");//\W非单词符号 [Then, when, you, have, found, shrubbery, you, must, cut, down, the, mightiest, tree, in, the, forest]
        split("n\\W+");//n非单词(Non-word)符号 [The, whe, you have found shrubbery , you must cut dow, the mightiest tree i, the forest ...]
    }

}
