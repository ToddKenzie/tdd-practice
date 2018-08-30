import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FooBarQixTest {

	// if %3 - return Foo
	// if %5 - return Bar
	// if %7 - return Qix
	// if has 3/5/7, return Foo/Bar/Qix in numeric order
	
	//add if has 0 - add '*' for each 0
	FooBarQix underTest = new FooBarQix();
	
	@Test
	public void AssertThatOneIs1() {
		String output = underTest.convertToFooBarQix(1);
		assertEquals("1", output);
	}
	
	@Test
	public void AssertThatTwoIs2() {
		String output = underTest.convertToFooBarQix(2);
		assertEquals("2", output);
	}
	
	@Test
	public void AssertThatThreeIsFooFoo() {
		String output = underTest.convertToFooBarQix(3);
		assertEquals("FooFoo", output);
	}
	
	@Test
	public void AssertThatFourIs4() {
		String output = underTest.convertToFooBarQix(4);
		assertEquals("4", output);
	}
	
	@Test
	public void AssertThatFiveIsBarBar() {
		String output = underTest.convertToFooBarQix(5);
		assertEquals("BarBar", output);
	}
	
	@Test
	public void AssertThatSevenIsQixQix() {
		String output = underTest.convertToFooBarQix(7);
		assertEquals("QixQix", output);
	}
	
	@Test
	public void AssertThatSixIsFoo() {
		String output = underTest.convertToFooBarQix(6);
		assertEquals("Foo", output);
	}
	
	@Test
	public void AssertThatNineIsFoo() {
		String output = underTest.convertToFooBarQix(9);
		assertEquals("Foo", output);
	}
	
	@Test
	public void AssertThatTenIsBar() {
		String output = underTest.convertToFooBarQix(10);
		assertEquals("Bar*", output);
	}
	
	@Test
	public void AssertThat12IsFoo() {
		String output = underTest.convertToFooBarQix(12);
		assertEquals("Foo", output);
	}
	
	@Test
	public void AssertThat13IsFoo() {
		String output = underTest.convertToFooBarQix(13);
		assertEquals("Foo", output);
	}
	
	@Test
	public void AssertThat14IsQix() {
		String output = underTest.convertToFooBarQix(14);
		assertEquals("Qix", output);
	}

	@Test
	public void AssertThat15IsFooBarBar() {
		String output = underTest.convertToFooBarQix(15);
		assertEquals("FooBarBar", output);
	}

	@Test
	public void AssertThat17IsQix() {
		String output = underTest.convertToFooBarQix(17);
		assertEquals("Qix", output);
	}

	@Test
	public void AssertThat21IsQix() {
		String output = underTest.convertToFooBarQix(21);
		assertEquals("FooQix", output);
	}

	@Test
	public void AssertThat23IsFoo() {
		String output = underTest.convertToFooBarQix(23);
		assertEquals("Foo", output);
	}

	@Test
	public void AssertThat25IsBarBar() {
		String output = underTest.convertToFooBarQix(25);
		assertEquals("BarBar", output);
	}

	@Test
	public void AssertThat30IsFooBarFoo() {
		String output = underTest.convertToFooBarQix(30);
		assertEquals("FooBarFoo*", output);
	}

	@Test
	public void AssertThat33IsFooFooFoo() {
		String output = underTest.convertToFooBarQix(33);
		assertEquals("FooFooFoo", output);
	}

	@Test
	public void AssertThat504IsFooQixBar() {
		String output = underTest.convertToFooBarQix(504);
		assertEquals("FooQixBar*", output);
	}
	
	@Test
	public void AssertThat2205IsFooQixBaraBar() {
		String output = underTest.convertToFooBarQix(2205);
		assertEquals("FooBarQix*Bar", output);
	}








	
	
	
	
}
