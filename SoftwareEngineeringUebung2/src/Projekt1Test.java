import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Projekt1Test {

	@Test
	void test1() {
		String s [] = {"A","B","C","D"};
		if (BuchstabenTest.isWellSortet(s)== false) fail("Not yet implemented");
	}
	@Test
	void test2() {
		String s [] = {"D","B","A","C"};
		if (BuchstabenTest.isWellSortet(s)== false) fail("Not yet implemented");
	}
	@Test
	void test3() {
		String s [] = {"D","D","D","D"};
		if (BuchstabenTest.isWellSortet(s)== false) fail("Not yet implemented");
	}
	@Test
	void test4() {
		String s [] = {"E","F","G","H"};
		assertTrue(BuchstabenTest.isWellSortet(s)== false);
	}
	
	
	
}
