import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ArryD {
	public  ArrayDeletion Ad = new ArrayDeletion(); 

	@Test
	public  void test() {
			int [] array = {1,2,3,4,5,6};
			
			int [] resultarray= {1,2,4,5,6,-1};
			Assert.assertArrayEquals(resultarray,Ad.delete(array,2));
			}
	@Test
	public void test2() {
		int [] array = {1,2,3,45,6};
		int [] resultarray= {1,2,3,45,6};
	Assert.assertArrayEquals(resultarray,Ad.delete(array, 6));
	
	}

}