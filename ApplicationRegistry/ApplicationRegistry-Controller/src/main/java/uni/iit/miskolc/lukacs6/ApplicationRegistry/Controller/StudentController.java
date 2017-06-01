package uni.iit.miskolc.lukacs6.ApplicationRegistry.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import uni.iit.miskolc.lukacs6.ApplicationRegistry.Controller.model.UserDetailsRequest;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Model.User;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.exception.InvalidRequestException;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.exception.InvalidTemplateException;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.exception.InvalidUserException;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Service.UserService;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Service.exception.UserNotExistsException;

@RestController
public class StudentController {

	@Autowired
	private UserService userService;
	@Autowired
	private Object requestService;

	public StudentController() {

	}

	private String getNeptuncode() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		return auth.getName();
	}

	@RequestMapping(value = "/modifyUser", method = RequestMethod.POST)
	public void modifyUser(@RequestBody UserDetailsRequest userDetailsRequest) throws UserNotExistsException {
		String neptuncode = getNeptuncode();
		this.userService.modifyUser(neptuncode, userDetailsRequest.getFirstname(), userDetailsRequest.getLastname(),
				userDetailsRequest.getAge(), userDetailsRequest.getEmail());
	}
	@RequestMapping(value = "/submit/{templateName}", method = RequestMethod.POST)
	public void submitRequest(@PathVariable("title") String title) throws InvalidRequestException, InvalidUserException, InvalidTemplateException {
		String neptuncode = getNeptuncode();
		this.requestService.submitRequest(neptuncode, title);
	}
	
	/*@RequestMapping(value = "/myRequests", method = RequestMethod.GET)
	public List<Request> listMyRequests() throws InvalidUserException {
		String neptuncode = getNeptuncode();
		return this.requestService.listRequestByUser(neptuncode);
	}*/

}
