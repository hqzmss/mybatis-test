package com.hqzmss.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisConfig {
    private static SqlSessionFactory sqlSessionFactory;

    public static synchronized SqlSessionFactory getSqlSessionFactory() {
        try {
            if(sqlSessionFactory == null) {
                String resource = "mybatis-config.xml";
                InputStream inputStream = Resources.getResourceAsStream(resource);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
                System.out.println("000");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sqlSessionFactory;
    }
}
