package org.wsoft.spring.beanannotation.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 定义BeanInterface接口的实现类1<br/>
 * 注解注入Ioc容器，并注解设置实现类的排序
 * 
 * @author wangstudyvc
 *
 */
@Order(2)
@Component
public class BeanImplOne implements BeanInterface {

}
