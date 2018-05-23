package org.wsoft.spring.beanannotation.injection.dao;

import org.springframework.stereotype.Repository;

/**
 * DAO层的实现类。</br>
 * 注解为注入到Ioc容器,Id为默认“injectionDAOImpl”
 * 
 * @author wangstudyvc
 *
 */
@Repository
public class InjectionDAOImpl implements InjectionDAO {

	public void save(String arg) {
		// 模拟数据库保存操作
		System.out.println("保存数据：" + arg);
	}

}
