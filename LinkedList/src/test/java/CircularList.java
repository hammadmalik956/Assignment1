import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CircularList {
	public CircularLinkedList CL = new CircularLinkedList();
	@Test
	public void test() {
		CL.pushFront(23);
		
		int expsize=1;
		Assert.assertEquals(expsize, CL.Listsize);
		CL.pushFront(76);
		expsize=2;
		Assert.assertEquals(expsize, CL.Listsize);
		CL.pushFront(54);
		expsize=3;
		Assert.assertEquals(expsize, CL.Listsize);
		CL.popFront();
		CL.popFront();
		CL.popFront();
		expsize=0;
		Assert.assertEquals(expsize, CL.Listsize);
		
		CL.pushBack(32);
		expsize=1;
		Assert.assertEquals(expsize, CL.Listsize);
		CL.pushBack(43);
		expsize=2;
		Assert.assertEquals(expsize, CL.Listsize);
		CL.pushBack(3);
		expsize=3;
		Assert.assertEquals(expsize, CL.Listsize);
		
		
		
		
		
		CL.display(); // only for coverage
	}

}
