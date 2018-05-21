package org.wsoft.spring.aware;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.wsoft.spring.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAware extends UnitTestBase {

	public TestAware() {
		super("classpath:spring-aware.xml");
	}

	@Test
	public void testMyApplicationContext() {
		System.out.println("TestAware'testMyApplicationContext : " + super.getBean("myApplicationContext").hashCode());
	}

	@Test
	public void testMyBeanName() {
		System.out.println("TestAware'testMyBeanName : " + super.getBean("myBeanName").hashCode());
	}

}
