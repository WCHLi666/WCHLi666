package com.dreamtank.idea;

public class AnnotationTest {
    @Override
    public String toString(){
        return super.toString();
    }

    @Deprecated
    public static void show(){

    }

    publicstatic void main(String[] args){
        List list = new ArrayList();
        System.out.println(list);

        int a = 10;
    }
}

interface A {
    public void show();
}
