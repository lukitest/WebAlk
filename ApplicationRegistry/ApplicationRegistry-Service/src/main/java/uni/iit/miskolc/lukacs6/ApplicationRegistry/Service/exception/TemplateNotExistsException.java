package uni.iit.miskolc.lukacs6.ApplicationRegistry.Service.exception;

public class TemplateNotExistsException extends Exception {
	private static final long serialVersionUID = 464646487998879L;
	

	public TemplateNotExistsException()  {
		super();
	}
	
	public TemplateNotExistsException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public TemplateNotExistsException(String message, Throwable cause) {
		super(message, cause);
	}

	public TemplateNotExistsException(String message) {
		super(message);
	}

	public TemplateNotExistsException(Throwable cause) {
		super(cause);
	}


}
