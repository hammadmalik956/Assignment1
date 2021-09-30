import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class STL {
	public StackLinked SL=new StackLinked();
	@Test
	public void test() {
		SL.push(0);
		SL.push(21);
		SL.push(7);
		SL.push(621);
		int expsize=4;
		Assert.assertEquals(expsize, SL.getSize());
		SL.pop();
		SL.pop();
		expsize=2;
		Assert.assertEquals(expsize, SL.getSize());
		SL.display();
		SL.main(null);
	}

}
