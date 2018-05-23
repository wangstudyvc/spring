package org.wsoft.spring.beanannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.wsoft.spring.base.UnitTestBase;


@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanAnnotation extends UnitTestBase {
	
	public TestBeanAnnotation() {
		super("classpath*:spring-beanannotation.xml");
	}
	
	@Test
	public void testEcho() {
		BeanAnnotation bean = super.getBean("beanAnnotation");
		bean.echo("Hello Annotation.");
		
		bean = super.getBean("bean");
		bean.echo("Hello Annotation.");
	}
	
	@Test
	public void testScpoe() {
		BeanAnnotation bean = super.getBean("beanAnnotation");
		bean.toHashCode();
		
		bean = super.getBean("beanAnnotation");
		bean.toHashCode();
	}
	
}
