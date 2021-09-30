import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ArryI {
	public ArrayInsertion AI=new ArrayInsertion();
	@Test
	public void test() {
		AI.size = 5;
		int [] array= new int[10];
		for(int i=0;i<10;i++) {
			array[i]=0;
		}
		array[1]=23;
		int [] resultarray= {43,0,23,0,0,0,0,0,0,0};
		Assert.assertArrayEquals(resultarray, AI.insert(array, 43, 0));
		

	}
	@Test
	public void test2(){
		AI.size = 5;
		int [] array= new int[4];
		for(int i=0;i<4;i++) {
			array[i]=0;
		}
		array[1]=23;
		int [] resultarray= {0,23,0,0};
		Assert.assertArrayEquals(resultarray, AI.insert(array, 43, 6));
		

	}
}
