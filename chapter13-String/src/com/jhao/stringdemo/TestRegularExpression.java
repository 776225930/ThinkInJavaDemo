package com.jhao.stringdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author JiangHao
 * @date 2020/5/3
 * @describe
 */
public class TestRegularExpression {

    public static void main(String[] args) {
        System.out.println(args[0]);
        if (args.length < 2) {
            System.out.println("Usage:\n TestRegularExpression characterSequence regularExpression :");
            System.exit(0);
        }
        System.out.print("Input: \"" + args[0] + "\"");
        for (String arg : args) {
            System.out.println("Regular Expression: \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            while (m.find()) {
                System.out.println("Match \"" + m.group() + "\" at positions " + m.start() + "-" + (m.end() - 1));
            }
        }
    }
}
