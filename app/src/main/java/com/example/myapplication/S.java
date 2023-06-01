package com.bcoin.ns;

/* loaded from: classes.dex */
public class S {
    public static native boolean releaseJNIRes();

    public native String concatTokenMd5(String str);

    public native String d(String str);

    public native String ft(String str);

    public native String gt(String str);

    public native String q(String str, String str2);

    public native String s(String str);

    public native String stringFromJNI();

    public native String test(String str);

    static {
        Runtime.getRuntime().addShutdownHook(new Thread() { // from class: com.bcoin.ns.S.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                S.releaseJNIRes();
            }
        });
        System.loadLibrary("ns");
    }
}