package learn.tech;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ApplicationTest {
	
	private Application app;
	
	@Before
	public void setUp() {
		app = new Application();
	}
	
	@Test
	public void testGreetUser() {
		String greetMessage = app.greet("Jill");
		assertTrue(greetMessage.equals("Hi, Jill"));
	}
	
	@Test
	public void testGreetBlank() {
		String greetMessage = app.greet("");
		assertTrue(greetMessage.equals(""));
	}
	
	@Test
	public void testGreetNull() {
		String greetMessage = app.greet(null);
		assertTrue(greetMessage.equals(""));
	}
	
	@Test
	public void testGreetSpace() {
		String greetMessage = app.greet("    ");
		assertTrue(greetMessage.equals(""));
	}

}
