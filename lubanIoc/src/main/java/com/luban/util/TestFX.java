package com.luban.util;

import java.lang.reflect.Field;
import java.util.List;

/**
 * @author 作者 lqq
 * @ClassName 类名 TestFX
 * @date 2019/10/24 11:39
 * @注释：
 */
public class TestFX {

	public static<T> String test(List<T> list) throws IllegalAccessException {
		for (T t : list) {
			Field[] fields = t.getClass().getDeclaredFields();
			for (Field field : fields) {
				field.setAccessible(true);
				System.out.println(field.getName());
				System.out.println(field.get(t));
			}
		}
		return null;
	}

}
