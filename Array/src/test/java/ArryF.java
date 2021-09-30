import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ArryF {
	public Array A =new Array();


	@Test
	public void test() {
		A.size=0;
		
		A.insert(23, 0);
		A.insert(2, 1);
		A.insert(233, 2);
		A.insert(213, 3);
		A.insert(21, 4);
		A.insert(26, 5);
		A.insert(273, 6);
		
		A.insert(354, 7);
	
		A.bubbleSort();
		
		A.display();
		
		boolean found =true;
		Assert.assertEquals(found, A.linearSearch(23));
		Assert.assertEquals(found, A.binarySearch(2, 0, A.size));
		
		A.delete(0);
		A.getValues();
		
		//function with no return values are just called for coverage
	}

}
