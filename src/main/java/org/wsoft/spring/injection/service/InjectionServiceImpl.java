package org.wsoft.spring.injection.service;

import org.wsoft.spring.injection.dao.InjectionDAO;

public class InjectionServiceImpl implements InjectionService {
	private InjectionDAO injectionDAO;

	/**
	 * 用于spring 的构造注入方式
	 * 
	 * @param injectionDAO
	 */
	public InjectionServiceImpl(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	public InjectionServiceImpl() {
	}

	/**
	 * 用于spring的方法注入
	 * 
	 * @param injectionDAO
	 */
	public void setInjectionDAO(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	@Override
	public void save(String param) {
		// 模拟业务逻辑
		System.out.println("业务逻辑层，保存业务数据：" + param);
		injectionDAO.save(param);
	}

}
