package org.wsoft.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 获取Spring容器上下文和Bean名称两个Aware的实现类
 * 
 * @author wangstudyvc
 *
 */
public class MyBeanName implements BeanNameAware, ApplicationContextAware {

	private String beanName;

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
		System.out.println("MyBeanName'setBeanName : " + name);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("MyBeanName'setApplicationContext : " + applicationContext.getBean(this.beanName).hashCode());
	}

}
