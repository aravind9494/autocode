package com.autoapp.one;

/**
 * this class is created for the testing purpose
 */
public class OneTest {
	/**
	 * Fails a test with the given message.
	 * 
	 * @param message the assertion error message
	 */
	public static void fail(String message) {
		throw new AssertionError(message);
	}

	/**
	 * Fails a test with no message.
	 */
	static public void fail() {
		fail(null);
	}

	/**
	 * args provided from cmd
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fail();
		fail("Failed");
	}

}
