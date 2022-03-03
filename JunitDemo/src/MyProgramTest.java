import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyProgramTest {

	@Test
	void testFindSum1()
	{
		MyProgram prog=new MyProgram();
		int actual=prog.findsum(10, 5);
		assertEquals(15, actual);
		
	}
	@Test
	void testFindSum2()
	{
		MyProgram prog=new MyProgram();
		int actual=prog.findsum(-2, 2);
		assertEquals(0, actual);
		
	}

}
