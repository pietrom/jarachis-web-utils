package org.amicofragile.jpeanuts.web;

import javax.servlet.ServletException;

public class CauseAwareServletException extends ServletException {
	public CauseAwareServletException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public CauseAwareServletException(Throwable cause) {
		super(cause);
	}

	@Override
	public Throwable getCause() {
		return getRootCause();
	}
}
