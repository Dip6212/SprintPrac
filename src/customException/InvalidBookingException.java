package customException;

public class InvalidBookingException extends RuntimeException{
	private static String msg = "Error in booking ticket";

	InvalidBookingException() {
		super(msg);
	}
	
	InvalidBookingException(String msg) {
		super(msg);
	}
}
