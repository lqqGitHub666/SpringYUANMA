package com.luban.test;

/**
 * @author 作者 lqq
 * @ClassName 类名 Father
 * @date 2020/6/10 15:27
 * @注释：
 */
public class Father {

	private String aa;
	private String cc;

	public Father() {
		System.out.println(222+"father");
	}

	public Father(String aa) {
		this.aa = aa;
		System.out.println(33333);
	}
	public Father(String cc,String aa) {
		this.cc = cc;
		this.aa = aa;
		System.out.println(33333);
	}
}
