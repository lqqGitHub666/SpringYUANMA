package com.luban.service;

/**
 * @author 作者 lqq
 * @ClassName 类名 UserServiceImpl
 * @date 2019/10/10 21:07
 * @注释：
 */
public class UserServiceImpl1 implements UserService {


//	@Autowired
//    private UserDao dao;

//    public UserServiceImpl(UserDao dao, OrderDao orderDao) {
//        this.dao = dao;
//        this.orderDao = orderDao;
//    }


    @Override
    public void find() {
        System.out.println("find");
    }
}
