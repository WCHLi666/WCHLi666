package com.dreamtank.idea;

public class Reflect_ClassTest {
    @Test
    public void test1(){
        User user = new User();
        Class class1 = user.getClass();
        System.out.println(class1);
    }

    @Test
    public void test2(){
        Class clazz = User.class;
        System.out.println(clazz);
    }
}
