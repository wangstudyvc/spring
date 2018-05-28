package org.wsoft.spring.beanannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.wsoft.spring.base.UnitTestBase;
import org.wsoft.spring.beanannotation.javabased.Store;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestJavabased extends UnitTestBase {

	public TestJavabased() {
		super("classpath*:spring-beanannotation.xml");
	}

	@Test
	public void test() {
		Store store = super.getBean("stringStore");
		System.out.println(store.getClass().getName());
	}

}
