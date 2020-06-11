package com.luban.util;

import com.luban.dao.UserDao;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author 作者 lqq
 * @ClassName 类名 ServiceLocator
 * @date 2019/10/18 13:58
 * @注释：
 */
//@Component
public class ServiceLocator implements ApplicationContextAware {
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println(this.getClass().getName()+"-------"+applicationContext.hashCode());
		Map<String,UserDao> map = applicationContext.getBeansOfType(UserDao.class);
		for (UserDao value : map.values()) {
			value.query();
		}
	}
}
