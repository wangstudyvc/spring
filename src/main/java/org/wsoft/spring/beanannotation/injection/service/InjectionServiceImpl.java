package org.wsoft.spring.beanannotation.injection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wsoft.spring.beanannotation.injection.dao.InjectionDAO;

/**
 * 服务层的实现类</br>
 * 注解为注入到Ioc容器,Id为“injectionServiceImpl”
 * 
 * @author wangstudyvc
 *
 */
@Service
public class InjectionServiceImpl implements InjectionService {
	/**
	 * 注解为自动装配，即为按类型方式自动装配<br/>
	 * 成员变量或set方法或构造方法自动装配都可以。
	 */
	@Autowired
	private InjectionDAO injectionDAO;

	// @Autowired
	public InjectionServiceImpl(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	// @Autowired
	public void setInjectionDAO(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	public InjectionServiceImpl() {
	}

	public void save(String arg) {
		// 模拟业务操作
		System.out.println("Service接收参数：" + arg);
		arg = arg + ":" + this.hashCode();
		injectionDAO.save(arg);
	}

}
