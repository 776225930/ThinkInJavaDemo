package com.jhao.stringdemo;

/**
 * @author JiangHao
 * @date 2020/5/2
 * @describe
 */
// strings/SprinklerSystem1.java
// TIJ4 Chapter Strings, Exercise 1, page 509
/* Analyze SprinklerSystem.toString() in reusing/SprinklerSystem.java to discover
 * whether writing the toString() with an explicit StringBuilder will save any
 * StringBuilder creations.
 */

class WaterSource {
    private String s;

    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}

public class SprinklerSystem1 {
    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    // appears to create only one StringBuilder: (using javap -c)
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        return builder.append("valve1 = ").append(valve1).append(" ")
                .append("valve2 = ").append(valve2).append(" ")
                .append("valve3 = ").append(valve3).append(" ")
                .append("valve4 = ").append(valve4).append(" ")
                .append("i = ").append(i).append(" ").append("f = ").append(f)
                .append(" ").append("source = ").append(source).toString();
//        return
        //WaterSource()
        //valve1 = null valve2 = null valve3 = null valve4 = null i = 0 f = 0.0 source = Constructed
//        "valve1 = " + valve1 + " " +
//                "valve2 = " + valve2 + " " +
//                "valve3 = " + valve3 + " " +
//                "valve4 = " + valve4 + " " +
//                "i = " + i + " " + "f = " + f + " " +
//                "source = " + source;
    }

    public static void main(String[] args) {
        SprinklerSystem1 sprinklers = new SprinklerSystem1();
        System.out.println(sprinklers);
    }
}
/**
 * Compiled from "SprinklerSystem1.java"
 * public class com.jhao.stringdemo.SprinklerSystem1 {
 * public com.jhao.stringdemo.SprinklerSystem1();
 * Code:
 * 0: aload_0
 * 1: invokespecial #1                  // Method java/lang/Object."<init>":()V
 * 4: aload_0
 * 5: new           #2                  // class com/jhao/stringdemo/WaterSource
 * 8: dup
 * 9: invokespecial #3                  // Method com/jhao/stringdemo/WaterSource."<init>":()V
 * 12: putfield      #4                  // Field source:Lcom/jhao/stringdemo/WaterSource;
 * 15: return
 * <p>
 * public java.lang.String toString();
 * Code:
 * 0: new           #5                  // class java/lang/StringBuilder
 * 3: dup
 * 4: invokespecial #6                  // Method java/lang/StringBuilder."<init>":()V
 * 7: ldc           #7                  // String valve1 =
 * 9: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
 * 12: aload_0
 * 13: getfield      #9                  // Field valve1:Ljava/lang/String;
 * 16: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
 * 19: ldc           #10                 // String  valve2 =
 * 21: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
 * 24: aload_0
 * 25: getfield      #11                 // Field valve2:Ljava/lang/String;
 * 28: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
 * 31: ldc           #12                 // String  valve3 =
 * 33: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
 * 36: aload_0
 * 37: getfield      #13                 // Field valve3:Ljava/lang/String;
 * 40: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
 * 43: ldc           #14                 // String  valve4 =
 * 45: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
 * 48: aload_0
 * 49: getfield      #15                 // Field valve4:Ljava/lang/String;
 * 52: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
 * 55: ldc           #16                 // String  i =
 * 57: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
 * 60: aload_0
 * 61: getfield      #17                 // Field i:I
 * 64: invokevirtual #18                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
 * 67: ldc           #19                 // String  f =
 * 69: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
 * 72: aload_0
 * 73: getfield      #20                 // Field f:F
 * 76: invokevirtual #21                 // Method java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
 * 79: ldc           #22                 // String  source =
 * 81: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
 * 84: aload_0
 * 85: getfield      #4                  // Field source:Lcom/jhao/stringdemo/WaterSource;
 * 88: invokevirtual #23                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
 * 91: invokevirtual #24                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
 * 94: areturn
 * <p>
 * public static void main(java.lang.String[]);
 * Code:
 * 0: new           #25                 // class com/jhao/stringdemo/SprinklerSystem1
 * 3: dup
 * 4: invokespecial #26                 // Method "<init>":()V
 * 7: astore_1
 * 8: getstatic     #27                 // Field java/lang/System.out:Ljava/io/PrintStream;
 * 11: aload_1
 * 12: invokevirtual #28                 // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
 * 15: return
 * }
 */
