import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class STackArrT {
	public StackArr SA=new StackArr();
	
	@Test
	public void test() {
		
		int exsize=0;
		SA.push(23);
		SA.push(78);
		exsize=2;
		Assert.assertEquals(exsize, SA.size);
		SA.pop();
		SA.push(78);
		SA.push(883);
		SA.pop();
		exsize=2;
		Assert.assertEquals(exsize, SA.size);
		SA.display();
		SA.main(null);
	}

}
