package org.wsoft.spring.beanannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Bean的注解方式注入和配置作用域的示例，代替xml配置. </br>
 * 
 * @author wangstudyvc
 *
 */
// @Component("bean")
@Scope("prototype")
@Component
public class BeanAnnotation {

	public void echo(String content) {
		System.out.println("BeanAnnotation'echo : " + content);
	}

	public void toHashCode() {
		System.out.println("BeanAnnotation'toHashCode : " + this.hashCode());
	}

}
