package org.wsoft.spring.beanannotation.multibean;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 自动装配到集合的示例
 * 
 * @author wangstudyvc
 *
 */
@Component
public class BeanInvoker {
	/**
	 * 因为注解的自动装配是按类型，所以所有满足此类型的类都会被自动装配进来。
	 */
	@Autowired
	private List<BeanInterface> list;
	/**
	 * 同List。KEY为Ioc容器中的Id
	 */
	@Autowired
	private Map<String, BeanInterface> map;

	public void say() {
		if (null != list && 0 != list.size()) {
			System.out.println("list...");
			for (BeanInterface bean : list) {
				System.out.println(bean.getClass().getName());
			}
		} else {
			System.out.println("List<BeanInterface> list is null !!!!!!!!!!");
		}

		System.out.println();

		if (null != map && 0 != map.size()) {
			System.out.println("map...");
			for (Map.Entry<String, BeanInterface> entry : map.entrySet()) {
				System.out.println(entry.getKey() + "      " + entry.getValue().getClass().getName());
			}
		} else {
			System.out.println("Map<String, BeanInterface> map is null !!!!!!!!!!");
		}
	}

}
