package com.luban.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 作者 lqq
 * @ClassName 类名 EnableLubanUtil
 * @date 2019/11/25 14:02
 * @注释：
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnableLubanUtil {

	String unama() default "root";
}
