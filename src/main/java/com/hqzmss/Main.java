package com.hqzmss;

import com.hqzmss.domain.Account;
import com.hqzmss.mybatis.MybatisConfig;
import org.apache.ibatis.session.SqlSession;

public class Main {
    public static void main(String[] args) {
        SqlSession session = null;
        try {
            session = MybatisConfig.getSqlSessionFactory().openSession();
            Account account = session.selectOne("com.hqzmss.mapper.AccountMapper.selectAccountById", "admin");
            System.out.println(account);
        } finally {
            session.close();
        }
    }
}
