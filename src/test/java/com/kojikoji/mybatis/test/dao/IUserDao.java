package com.kojikoji.mybatis.test.dao;

/**
 * @author fuyinshen <fuyinshen@kuaishou.com>
 * Created on 2023-11-09
 */
public interface IUserDao {
    String queryUserName(String uId);

    Integer queryUserAge(String uId);
}
