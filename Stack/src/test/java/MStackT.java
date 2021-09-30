import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MStackT {
	public MyStack MS =new MyStack(8);
	@Test
	public void test() throws Exception {
		
		MS.push(80);
		MS.push(7);
		Assert.assertEquals(7, MS.pop());
		MS.push(87);
		MS.push(76);
		Assert.assertEquals(76, MS.top());
		
		MS.displayStack();
		
	}

}
