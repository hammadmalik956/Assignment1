import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class QueLinkT {
	public QueueLinked QL = new QueueLinked();
	@Test
	public void test() {
		int expsize=0;
		QL.enqueue(2);
		QL.enqueue(89);
		expsize=2;
		Assert.assertEquals(expsize, QL.size);
		QL.dequeue();
		QL.dequeue();
		expsize=0;
		Assert.assertEquals(expsize, QL.size);
		
		
		QL.display();
		QL.main(null);
	}

}
