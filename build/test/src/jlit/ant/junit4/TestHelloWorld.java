package jlit.ant.junit4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestHelloWorld {

	private HelloWorld hw;
	
	@Before
	public void setUp() {
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
	
	@Test
	public void testNil() {
		Assert.assertNull("测试应该为空失败.", null);
	}
	
	@Test
	public void testNotNil() {
		Assert.assertNotNull("测试不应该为空失败", "hello world.");
	}
	
	@Test
	public void testException() {
		try {
			hw.exp();
			Assert.fail("测试应该抛出异常.");
		} catch (NumberFormatException e) {
		}
	}
	
	@After
	public void tearDown() {
		hw = null;
	}
}
