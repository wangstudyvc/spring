package org.wsoft.spring.interfaces;

/**
 * 接口实现类
 * @author wangjun
 *
 */
public class OneInterfaceImpl implements OneInterface {

	@Override
	public String echo(String content) {
		return "echo: " + content;
	}

}
