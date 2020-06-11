package com.luban.intercepter;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 作者 lqq
 * @ClassName 类名 MyMethodInterceptor
 * @date 2019/10/28 17:29
 * @注释：
 */
public class MyMethodInterceptor implements MethodInterceptor {
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("method------");
		return methodProxy.invokeSuper(o,objects);
	}
}
