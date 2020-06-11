package com.luban.test;

import com.luban.config.AppConfig;
import com.luban.dao.UserDao;
import com.luban.dao.UserDaoImpl;
import com.luban.intercepter.MyMethodInterceptor;
import com.luban.model.User;
import com.luban.service.UserService;
import com.luban.util.TestFX;
import org.springframework.cglib.core.SpringNamingPolicy;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.*;

/**
 * @author 作者 lqq
 * @ClassName 类名 Test
 * @date 2019/10/10 21:10
 * @注释：
 */
public class Test {

	private static String a = "1";


    private String ss = "ss";

    public static String aa(){
        return new Test().ss;
    }

    public static void main(String[] args) {

		/**线程不安全*/
		ArrayList arrayList = new ArrayList(5);
		/**线程不安全*/
		LinkedList linkedList = new LinkedList();
		/**线程安全*/
		Vector vector = new Vector();
		/**线程不安全*/
		TreeMap treeMap = new TreeMap();
		/**线程安全*/
		Hashtable hashtable = new Hashtable();
		/**线程不安全*/
		HashMap hashMap = new HashMap();

		/**
		 * spring容器中的类分为四种
		 * 1，普通类    扫描之后完成注册
		 * 2，importSelector   先放到configurationClasses，然后在注册
		 * 3，Registar    先放到loadBeanDefinitionsFromRegistrars，然后在注册
		 * 4，import普通类  先放到configurationClasses，然后再注册
		 */

    	//把spring所有的前提环境准备
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(AppConfig.class);
        //初始化spring环境
        annotationConfigApplicationContext.refresh();
//        AppConfig appConfig = annotationConfigApplicationContext.getBean(AppConfig.class);
//		UserService userService = (UserService) annotationConfigApplicationContext.getBean("userServiceImpl");
//		UserService userService1 = (UserService) annotationConfigApplicationContext.getBean("userServiceImpl");
//		UserDao userDao = (UserDao) annotationConfigApplicationContext.getBean("userDaoImpl");
//		userDao.query();
//		System.out.println(userService.hashCode() +"---------"+userService1.hashCode());
//		userService.find();
		Enhancer enhancer = new Enhancer();
		//增强父类，cglib是基于继承来的
		enhancer.setSuperclass(UserDaoImpl.class);
		enhancer.setCallback(new MyMethodInterceptor());
		UserDaoImpl userDao1= (UserDaoImpl) enhancer.create();
		userDao1.query();

		enhancer.setSuperclass(UserDaoImpl.class);
		enhancer.setCallback(new MyMethodInterceptor());
		UserDaoImpl userDaoImpl = (UserDaoImpl) enhancer.create();
		userDaoImpl.query();
	}
}
