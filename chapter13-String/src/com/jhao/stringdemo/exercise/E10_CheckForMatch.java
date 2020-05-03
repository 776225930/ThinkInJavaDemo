package com.jhao.stringdemo.exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author JiangHao
 * @date 2020/5/3
 * @describe
 */
public class E10_CheckForMatch {

    public static void main(String[] args) {
        String source = "Java now has regular expressions";
        String[] regEx = new String[]{"^Java", "\\Breg.*", "n.w\\s+h(a|i)s",
                "s?", "s*", "s+", "s{4}", "s{0,3}"};
        for (String pattern : regEx) {
            System.out.println();
            System.out.println(
                    "Regular expression: \"" + pattern + "\"");
            Pattern compile = Pattern.compile(pattern);
            Matcher matcher = compile.matcher(source);
            while (matcher.find()) {
                System.out.println("Match \"" + matcher.group() +
                        "\" at positions " + matcher.start() + "-" +
                        (matcher.end() - 1));
            }
        }
//        Pattern compile = Pattern.compile("n.w\\s+h(a|i)s");
//        Matcher matcher = compile.matcher(source);
//        System.out.println(matcher.groupCount());
    }
}
