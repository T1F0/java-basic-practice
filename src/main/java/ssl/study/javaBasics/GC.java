package com.supconit.study.JavaBasics;

public class GC {
    public Object m() {
        Object o = new Float(3.14F);
        Object[] oa = new Object[1];
        oa[0] = o;
        o = null;
        oa[0] = null;
        System.out.println("return 0");
        //本来没有，方法需要
        return o;
    }
}
