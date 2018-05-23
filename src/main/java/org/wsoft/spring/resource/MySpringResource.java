package org.wsoft.spring.resource;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

/**
 * 获取资源文件的示例</br>
 * 使用Spring容器的Resource和ResourceLoader方法。</br>
 * 其中ResourceLoader是ApplicationContext的接口
 * 
 * @author wangstudyvc
 *
 */
public class MySpringResource implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public void resource() throws IOException {
//		Resource resource = applicationContext.getResource("config-test.xml");
		Resource resource = applicationContext.getResource("classpath:config-test.xml");
//		Resource resource = applicationContext.getResource("file:F:\\github\\wangstudyvc\\spring\\src\\main\\resources\\config-test.xml");
//		Resource resource = applicationContext.getResource("url:https://www.baidu.com/img/bd_logo1.png");
		System.out.println(resource.getFilename());
		System.out.println(resource.contentLength());
	}

}
