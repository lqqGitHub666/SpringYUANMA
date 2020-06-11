package com.luban.config;

import com.luban.service.UserServiceImpl;
import com.luban.service.UserServiceImpl1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author 作者 lqq
 * @ClassName 类名 AppConfug
 * @date 2019/10/16 21:47
 * @注释：
 */
@Configuration
@ComponentScan("com.luban")
//@EnableAspectJAutoProxy
public class AppConfig {

//	@Bean
//	public UserServiceImpl userServiceImpl(){
//		System.out.println("..........");
//		return new UserServiceImpl();
//	}
//
//	@Bean
//	public UserServiceImpl1 userServiceImpl1(){
//		userServiceImpl();
//		return new UserServiceImpl1();
//	}
//
//	public static void main(String[] args) {
//		System.out.println(System.getProperty("user.dir"));
//	}
}
