package jlit.ant.junit4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestHelloWorld {

	private HelloWorld hw;
	
	@Before
	public void setUp() {
		System.out.println("junit4 init.");
		hw = new HelloWorld();
	}
	
	@Test
	public void testHello() {
		String str = hw.hello();
		Assert.assertEquals("测试hello失败.", str, "hello");
	}
	
	@Test
	public void testWorld() {
		String str = hw.world();
		Assert.assertEquals("测试world失败.", str, "world");
	}
	
	@After
	public void tearDown() {
		System.out.println("junit4 destory.");
		hw = null;
	}
}
