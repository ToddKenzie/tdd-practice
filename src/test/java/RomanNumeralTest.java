import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumeralTest {

	//1 = I, 5 = V, 10 = X, 50 = L, 100 = C, 500 = D, 1000 = M
	
	RomanNumerals underTest = new RomanNumerals();
	
	@Test
	public void assertThatCheckOneIsI() {
		String check = underTest.ConvertToRomanNum(1);
		assertEquals("I", check);
	}
	
	@Test
	public void assertThatCheck2IsII() {
		String check = underTest.ConvertToRomanNum(2);
		assertEquals("II", check);
	}
	
	@Test
	public void assertThatCheck3IsIII() {
		String check = underTest.ConvertToRomanNum(3);
		assertEquals("III", check);
	}
	
	@Test
	public void assertThatCheck4IsIV() {
		String check = underTest.ConvertToRomanNum(4);
		assertEquals("IV", check);
	}
	
	@Test
	public void assertThatCheck5IsV() {
		String check = underTest.ConvertToRomanNum(5);
		assertEquals("V", check);
	}
	
	@Test
	public void assertThatCheck6IsVI() {
		String check = underTest.ConvertToRomanNum(6);
		assertEquals("VI", check);
	}
	
	@Test
	public void assertThatCheck7IsVII() {
		String check = underTest.ConvertToRomanNum(7);
		assertEquals("VII", check);
	}
	
	@Test
	public void assertThatCheck8IsVIII() {
		String check = underTest.ConvertToRomanNum(8);
		assertEquals("VIII", check);
	}
	
	@Test
	public void assertThatCheck9IsIX() {
		String check = underTest.ConvertToRomanNum(9);
		assertEquals("IX", check);
	}
	
	@Test
	public void assertThatCheck10IsX() {
		String check = underTest.ConvertToRomanNum(10);
		assertEquals("X", check);
	}
	
	@Test
	public void assertThatCheck11IsXI() {
		String check = underTest.ConvertToRomanNum(11);
		assertEquals("XI", check);
	}

	@Test
	public void assertThatCheck14IsXIV() {
		String check = underTest.ConvertToRomanNum(14);
		assertEquals("XIV", check);
	}
	
	@Test
	public void assertThatCheck19IsXIX() {
		String check = underTest.ConvertToRomanNum(19);
		assertEquals("XIX", check);
	}
	
	@Test
	public void assertThatCheck20IsXX() {
		String check = underTest.ConvertToRomanNum(20);
		assertEquals("XX", check);
	}
	@Test
	public void assertThatCheck39IsXXXIX() {
		String check = underTest.ConvertToRomanNum(39);
		assertEquals("XXXIX", check);
	}
	
	@Test
	public void assertThatCheck40IsXL() {
		String check = underTest.ConvertToRomanNum(40);
		assertEquals("XL", check);
	}
	
	@Test
	public void assertThatCheck49IsXLIX() {
		String check = underTest.ConvertToRomanNum(49);
		assertEquals("XLIX", check);
	}
	
	@Test
	public void assertThatCheck50IsL() {
		String check = underTest.ConvertToRomanNum(50);
		assertEquals("L", check);
	}

	@Test
	public void assertThatCheck99IsXCIX() {
		String check = underTest.ConvertToRomanNum(99);
		assertEquals("XCIX", check);
	}
	
	@Test
	public void assertThatCheck100IsC() {
		String check = underTest.ConvertToRomanNum(100);
		assertEquals("C", check);
	}
	
	@Test
	public void assertThatCheck500IsD() {
		String check = underTest.ConvertToRomanNum(500);
		assertEquals("D", check);
	}
	
	@Test
	public void assertThatCheck2499IsMMCDXCIX() {
		String check = underTest.ConvertToRomanNum(2499);
		assertEquals("MMCDXCIX", check);
	}





	
}
