package uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.exception;

public class InvalidTemplateException extends Exception {
	private static final long serialVersionUID = -989789769954L;

	public InvalidTemplateException() {
		super();
	}

	public InvalidTemplateException(
		String message,
		Throwable cause,
		boolean enableSuppression,
		boolean writableStackTrace
	) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidTemplateException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidTemplateException(String message) {
		super(message);
	}

	public InvalidTemplateException(Throwable cause) {
		super(cause);
	}
}