package com.luban.util;

/**
 * @author 作者 lqq
 * @ClassName 类名 Demo
 * @date 2019/10/18 15:05
 * @注释：
 */
public class Demo {

	private static int anInt = 1;

	static {
		System.out.println("22222");
	}

	static class Demo1{
		private static int bnInt = 2;
		static {
			System.out.println("1111111");
		}

	}

	public static void ss(){
		System.out.println(Demo1.bnInt);
	}

	public static void main(String[] args) {
//		System.out.println(Demo.anInt);
		Demo.ss();
	}

}
