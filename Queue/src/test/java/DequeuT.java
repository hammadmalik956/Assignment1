import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DequeuT {
	public  Dequeue Dq= new Dequeue(5);
	@Test
	public void test() {
		
		Dq.addLeft(5);
		Dq.addRight(3);
		Dq.addLeft(2);
		Dq.addRight(53);
		Dq.addRight(4);
		int [] exparray= {5,2,4,53,3};
	
			Assert.assertArrayEquals(exparray, Dq.display());
		
	}

}
