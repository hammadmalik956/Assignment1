import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class LinkedL {
	public LinkedList LL = new LinkedList();
	@Test
	public void test() {
		LL.pushFront(23);
		
		int expsize=1;
		Assert.assertEquals(expsize, LL.size);
		LL.pushFront(76);
		expsize=2;
		Assert.assertEquals(expsize, LL.size);
		LL.pushFront(54);
		expsize=3;
		Assert.assertEquals(expsize, LL.size);
		LL.popFront();
		LL.popFront();
		LL.popFront();
		expsize=0;
		Assert.assertEquals(expsize, LL.size);
		
		LL.pushBack(32);
		expsize=1;
		Assert.assertEquals(expsize, LL.size);
		LL.pushBack(43);
		expsize=2;
		Assert.assertEquals(expsize, LL.size);
		LL.pushBack(3);
		expsize=3;
		Assert.assertEquals(expsize, LL.size);
		
		LL.popBack();
		expsize=2;
		Assert.assertEquals(expsize, LL.size);
		LL.pop(1);
		expsize=1;
		Assert.assertEquals(expsize, LL.size);
		LL.pop(0);
		expsize=0;
		Assert.assertEquals(expsize, LL.size);
		LL.pushBack(23);
		LL.pushFront(21);
		LL.pushBack(28);
		LL.pushBack(9);
		
		LL.swap();
		
		
		LL.display(); //only for coverage
		LL.main(null);
		
	}

}
