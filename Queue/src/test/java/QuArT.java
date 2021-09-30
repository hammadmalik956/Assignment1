import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class QuArT {
	public QueueArray QAT= new QueueArray(5);
	@Test
	public void test() {
		int expecsize=0;
		QAT.enqueue(19);
		expecsize=1;
		Assert.assertEquals(expecsize, QAT.size);
		QAT.enqueue(2);
		QAT.enqueue(87);
		expecsize=3;
		Assert.assertEquals(expecsize, QAT.size);
		QAT.dequeue();
		expecsize=2;
		Assert.assertEquals(expecsize, QAT.size);
		QAT.dequeue();
		expecsize=1;
		Assert.assertEquals(expecsize, QAT.size);	
		
		QAT.display();
		QAT.main(null);
	}

}
