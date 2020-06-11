package com.luban.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author 作者 lqq
 * @ClassName 类名 BeanPostProcessor
 * @date 2019/10/21 21:26
 * @注释：
 */
//@Component
public class TestBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("userDaoImpl")){
			System.out.println("BeforeInitialization");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("userDaoImpl")){
			System.out.println("AfterInitialization");
		}
		return bean;
	}
}
