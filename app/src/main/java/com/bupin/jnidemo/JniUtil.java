package com.bupin.jnidemo;

public class JniUtil {


    static {
        System.loadLibrary("testjni");
    }
    private static JniUtil mJniUtil = new JniUtil();

    private JniUtil() {

    }

    public static JniUtil getInstance() {
        return mJniUtil;
    }

    public native void helloFromC();
    public native int testInt(int a,int b);
    public native boolean testBoolean(boolean a);
    public native String testString(String s1,String s2);
    public native void testArray(int[] arr);

}
