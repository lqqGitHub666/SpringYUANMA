package com.luban.cyclic_dependence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 作者 lqq
 * @ClassName 类名 A
 * @date 2020/7/2 11:02
 * @注释：
 */
@Component
public class A {

	@Autowired
	private B b;
}
