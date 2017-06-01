package uni.iit.miskolc.lukacs6.ApplicationRegistry.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import uni.iit.miskolc.lukacs6.ApplicationRegistry.Controller.model.ErrorResponse;

@ControllerAdvice
public class ExceptionHandlerController {

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	@ResponseBody ErrorResponse
	exception(Exception e) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setMessage("Internal server error");
		errorResponse.setReason(null);
		
		e.printStackTrace();
		return errorResponse;
	}
}