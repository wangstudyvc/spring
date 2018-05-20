package org.wsoft.spring.interfaces;

/**
 * 接口实现类
 * @author wangstudyvc
 *
 */
public class OneInterfaceImpl implements OneInterface {

	@Override
	public String echo(String content) {
		return "echo: " + content;
	}

}
