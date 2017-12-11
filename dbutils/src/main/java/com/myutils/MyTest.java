package com.myutils;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: ZhangQingrong
 * @Date : 2017/7/28 10:57
 */
public class MyTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:spring/springConfig.xml");
        DBDaoImpl dbDaoImpl = applicationContext.getBean(DBDaoImpl.class);
        Goods query = dbDaoImpl.query("select * from csair_eshop.csair_goods t where t.category_id=? and t.disabled = '0' and t.is_auth = '1'", Goods.class, "3");
        System.out.printf("result : " + query);
    }
}
