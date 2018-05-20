package org.wsoft.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Bean的初始化和销毁的示例
 * 1、spring容器加载bean或销毁时就调用，与用bean与否无关。
 * 2、只有bean的单独配置可以覆盖全局默认配置。
 * 3、实现接口方式的初始化或销毁的调用优先于配置。
 * 
 * 
 * @author wangstudyvc
 *
 */
public class BeanLifeCycle implements InitializingBean, DisposableBean {

	public void defautInit() {
		System.out.println("Bean defautInit.");
	}

	public void defaultDestroy() {
		System.out.println("Bean defaultDestroy.");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Bean destroy.");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean afterPropertiesSet.");
	}

	public void start() {
		System.out.println("Bean start .");
	}

	public void stop() {
		System.out.println("Bean stop.");
	}

}
