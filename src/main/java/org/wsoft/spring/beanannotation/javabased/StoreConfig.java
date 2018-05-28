package org.wsoft.spring.beanannotation.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 相当于spring容器中xml配置的效果。</br>
 * 注解@Bean一般都是和@Configuration一起使用。
 * 
 * @author wangstudyvc
 *
 */
@Configuration
public class StoreConfig {

	@Bean(name = "stringStore", initMethod = "init", destroyMethod = "destroy")
	public Store stringStore() {
		return new StringStore();
	}

}
