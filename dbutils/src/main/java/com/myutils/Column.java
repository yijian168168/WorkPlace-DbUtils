package com.myutils;

import java.lang.annotation.*;

/**
 * Created by w-zhouyunxiang on 2017/6/30.
 */
@Inherited
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
    String value();
}
