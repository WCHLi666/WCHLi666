package com.dreamtank.idea;

public @interface MyAnnotation {
    public String[] show();
    boolean[] a();
    MyEnum[] me();
    MyAnnotation2[] ma2();
    Class[] clazz();

}
