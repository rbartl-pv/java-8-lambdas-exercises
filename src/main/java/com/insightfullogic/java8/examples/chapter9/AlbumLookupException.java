package com.insightfullogic.java8.examples.chapter9;

@SuppressWarnings("javadoc")
public class AlbumLookupException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AlbumLookupException(Throwable cause) {
        super(cause);
    }

    public AlbumLookupException(String message) {
        super(message);
    }

}
