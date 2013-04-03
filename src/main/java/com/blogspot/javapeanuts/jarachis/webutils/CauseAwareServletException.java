package com.blogspot.javapeanuts.jarachis.webutils;

import javax.servlet.ServletException;

public class CauseAwareServletException extends ServletException {
	private static final long serialVersionUID = 1L;

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
