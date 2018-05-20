package org.wsoft.spring.injection.dao;

/**
 * 持久化接口的实现类
 * 
 * @author wangstudyvc
 *
 */
public class InjectionDAOImpl implements InjectionDAO {

	@Override
	public void save(String param) {
		// 模拟持久化保存到数据库
		System.out.println("保存到数据库的数据：" + param);
	}

}
