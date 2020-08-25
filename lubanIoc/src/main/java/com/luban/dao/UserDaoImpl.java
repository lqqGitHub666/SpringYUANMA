package com.luban.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 作者 lqq
 * @ClassName 类名 UserDaoImpl
 * @date 2019/10/10 21:05
 * @注释：
 */
//@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	OrderDaoImpl orderDao;

	@Override
    public void query() {
        System.out.println("dao");
    }
}
