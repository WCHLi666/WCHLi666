package com.dreamtank.idea;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Documented
public @interface MyAnnotation2 {
    String[] value() ;
    int a();
}
