package org.wsoft.spring.beanannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.wsoft.spring.base.UnitTestBase;
import org.wsoft.spring.beanannotation.injection.service.InjectionService;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {

	public TestInjection() {
		super("classpath:spring-beanannotation.xml");
	}

	@Test
	public void testAutowired() {
		InjectionService service = super.getBean("injectionServiceImpl");
		service.save("This is autowired.");
	}

}
