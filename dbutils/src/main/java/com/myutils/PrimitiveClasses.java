package com.myutils;

/**
 * @Author: ZhangQingrong
 * @Date : 2017/7/28 10:02
 */
import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("serial")
public final class PrimitiveClasses {

    private final static List<Class<?>> PRIMITIVES = new ArrayList<Class<?>>(){{
        add(Long.class);
        add(Integer.class);
        add(String.class);
        add(java.util.Date.class);
        add(java.sql.Date.class);
        add(java.sql.Timestamp.class);
    }};

    public static boolean isPrimitive(Class<?> cls) {
        return cls.isPrimitive() || PRIMITIVES.contains(cls) ;
    }

}

