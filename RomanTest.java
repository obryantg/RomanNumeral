package romans;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanTest {

	@Test
	public void testOneToThree() {
		assertEquals("1","I",ConvertNum.arabicToRom(1));
		assertEquals("2","II",ConvertNum.arabicToRom(2));
		assertEquals("3","III",ConvertNum.arabicToRom(3));
	}

	@Test
	public void testFourAndFive() {
		assertEquals("4","IV",ConvertNum.arabicToRom(4));
		assertEquals("5","V",ConvertNum.arabicToRom(5));
	}
	
	@Test
	public void testSixToEight() {
		assertEquals("6","VI",ConvertNum.arabicToRom(6));
		assertEquals("8","VIII",ConvertNum.arabicToRom(8));
	}
	@Test
	public void testNine() {
		assertEquals("9","IX",ConvertNum.arabicToRom(9));
	}
	@Test
	public void test10() {
		assertEquals("10","X",ConvertNum.arabicToRom(10));
	}
	@Test
	public void test14() {
		assertEquals("14","XIV",ConvertNum.arabicToRom(14));
	}
	@Test
	public void test51() {
		assertEquals("51","LI",ConvertNum.arabicToRom(51));
	}
	@Test
	public void test127() {
		assertEquals("127","CXXVII",ConvertNum.arabicToRom(127));
	}
	@Test
	public void test27() {
		assertEquals("27","XXVII",ConvertNum.arabicToRom(27));
	}
}
