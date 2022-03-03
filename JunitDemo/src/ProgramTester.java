import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ProgramTester {

	@Test
public void test1()
	{
		try {
	int res=new Program1().solution("a#n90");
		}catch (BugException e) {
		assertEquals("Invalid Character",e.getMessage());
		}
	}
	@Test
public void test2()
	{
		try {
	int res=new Program1().solution("a123");
		assertEquals (6, res);
	}catch (BugException e) {
		fail();
	}
	}
}
