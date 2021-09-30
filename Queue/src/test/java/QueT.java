import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class QueT {
	public Queue Qu =new Queue(5);
	@Test
	public void test() throws Exception {
		Qu.enqueue(5);
		Qu.enqueue(10);
		Qu.enqueue(7);
		int size =0;
		size=3;
		Assert.assertEquals(size, Qu.sizeofQueue);
		
		Qu.dequeue();
		size=2;
		Assert.assertEquals(size, Qu.sizeofQueue);
		Qu.dequeue();
		Qu.dequeue();
		boolean isempty =true;
		Assert.assertEquals(isempty, Qu.empty());
		
		Qu.display();
		Qu.enqueue(4);
		Qu.enqueue(19);
		
		Qu.size();
		Qu.display();
		Qu.main(null);
	}

}
