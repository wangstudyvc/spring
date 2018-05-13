package org.wsoft.spring.interfaces;

/**
 * 程序入口
 * 
 * @author wangjun
 *
 */
public class Main {
	public static void main(String[] args) {
		OneInterface oneInterface = new OneInterfaceImpl();
		System.out.println(oneInterface.echo("Hello Spring!"));
	}
}
