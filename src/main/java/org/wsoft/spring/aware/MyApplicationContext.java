package org.wsoft.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 获取Spring容器上下文的Aware的实现类
 * 
 * @author wangstudyvc
 *
 */
public class MyApplicationContext implements ApplicationContextAware {

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("MyApplicationContext'setApplicationContext : " + applicationContext.getBean("myApplicationContext").hashCode());
	}

}
