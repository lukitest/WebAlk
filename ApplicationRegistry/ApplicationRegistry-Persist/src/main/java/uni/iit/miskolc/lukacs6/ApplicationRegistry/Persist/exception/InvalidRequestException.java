package uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.exception;

public class InvalidRequestException extends Exception {
	private static final long serialVersionUID = -989785259954L;

	public InvalidRequestException() {
		super();
	}

	public InvalidRequestException(
		String message,
		Throwable cause,
		boolean enableSuppression,
		boolean writableStackTrace
	) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidRequestException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidRequestException(String message) {
		super(message);
	}

	public InvalidRequestException(Throwable cause) {
		super(cause);
	}
	

}
