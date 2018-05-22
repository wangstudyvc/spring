package org.wsoft.spring.autowiring;

/**
 * 自动装配Servcie示例类
 * 
 * @author wangstudyvc
 *
 */
public class AutoWiringService {
	/**
	 * 自动装配DAO类
	 */
	private AutoWiringDAO autoWiringDAO;

	/**
	 * 构造器装配。根据Ioc容器中xml配置的类型查找和装配
	 * 
	 * @param autoWiringDAO
	 */
	public AutoWiringService(AutoWiringDAO autoWiringDAO) {
		System.out.println("AutoWiringService 构造器装配.");
		this.autoWiringDAO = autoWiringDAO;
	}
	
	public AutoWiringService() {
	}

	/**
	 * 用于ByName和ByType时，分别是根据Ioc容器中xml配置的Id和类型查找和装配。
	 * 
	 * @param autoWiringDAO
	 */
	public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
		System.out.println("AutoWiringService by Name or type.");
		this.autoWiringDAO = autoWiringDAO;
	}

	public void save(String data) {
		this.autoWiringDAO.save(data);
	}

}
