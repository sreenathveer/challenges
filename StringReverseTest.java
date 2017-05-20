import static org.junit.Assert.*;

import org.junit.Test;

public class StringReverseTest {

	@Test
	public void testStringReverse() {
		
		assertEquals(ReverseString.reverse(""),"Empty String");
		assertEquals(ReverseString.reverse("hcl2"),"2lch");
	}

}
