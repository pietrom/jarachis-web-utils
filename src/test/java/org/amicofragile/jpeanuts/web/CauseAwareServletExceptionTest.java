package org.amicofragile.jpeanuts.web;

import javax.servlet.ServletException;

import org.junit.Test;
import static org.junit.Assert.*;

public class CauseAwareServletExceptionTest {
	private static final String ERROR_MESSAGE = "Error message";

	@Test
	public void givenInitializationMessageAndThrowableCauseThenProvidesThemThroughStandardMethod() {
		Throwable cause = new Exception();
		ServletException exception = new CauseAwareServletException(ERROR_MESSAGE, cause);
		assertEquals(ERROR_MESSAGE, exception.getMessage());
		assertEquals(cause, exception.getCause());
	}
	
	@Test
	public void givenThrowableCauseThenProvidesThemThroughStandardMethod() {
		Throwable cause = new Exception();
		ServletException exception = new CauseAwareServletException(cause);
		assertEquals(cause, exception.getCause());
	}
}
