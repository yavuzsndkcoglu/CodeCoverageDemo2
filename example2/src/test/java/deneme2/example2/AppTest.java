package deneme2.example2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void testNameTry() {

        App obj = new App();
        assertEquals("Hello tester", obj.getMessage("tester"));

    }

	@Test
    public void testNameEmpty() {

        App obj = new App();
        assertEquals("Please provide a name!", obj.getMessage(""));

    }
	 @Test
	    public void testNameNull() {

	        App obj = new App();
	        assertEquals("Please provide a name!", obj.getMessage(null));

	    }
}