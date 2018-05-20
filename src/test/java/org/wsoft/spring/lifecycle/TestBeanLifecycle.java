package org.wsoft.spring.lifecycle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.wsoft.spring.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanLifecycle extends UnitTestBase {

	public TestBeanLifecycle() {
		super("classpath:spring-lifecycle.xml");
	}

	@Test
	public void test() {
	}

}
