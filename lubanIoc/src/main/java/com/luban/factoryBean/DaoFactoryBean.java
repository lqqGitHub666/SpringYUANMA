package com.luban.factoryBean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author 作者 lqq
 * @ClassName 类名 DaoFactoryBean
 * @date 2019/10/12 15:25
 * @注释：如果你的类实现了FactioryBean
 * 那么spring容器当中存在两个对象，一个是getBean()返回的对象
 * 还有一个是当前类对象
 *
 * getObject()得到的对象存在的是当前类指定的名字
 * 当前对象是“&”+当前类的名字
 */
public class DaoFactoryBean {
//	implements FactoryBean
//    @Override
//    public Object getObject() throws Exception {
//        return null;
//    }
//
//    @Override
//    public Class<?> getObjectType() {
//        return null;
//    }
//
//    @Override
//    public boolean isSingleton() {
//        return false;
//    }
}
