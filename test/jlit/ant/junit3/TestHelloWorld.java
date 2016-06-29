package jlit.ant.junit3;

import jlit.ant.junit3.HelloWorld;
import junit.framework.TestCase;

public class TestHelloWorld extends TestCase{

	private HelloWorld hw;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		hw = new HelloWorld();
		System.out.println("JUnit init.");
	}
	
	public void testHello() {
		String str = hw.hello();
		assertEquals("测试hello()失败", str, "hello");
	}
	
	public void testWorld() {
		String str = hw.world();
		assertEquals("测试world()失败", str, "world");
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		hw = null;
		System.out.println("JUnit destory.");
	}
}
