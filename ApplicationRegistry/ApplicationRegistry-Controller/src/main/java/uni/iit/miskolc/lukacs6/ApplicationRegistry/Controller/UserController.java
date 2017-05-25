package uni.iit.miskolc.lukacs6.ApplicationRegistry.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import uni.iit.miskolc.lukacs6.ApplicationRegistry.Controller.model.UserDetailsRequest;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Model.User;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Service.UserService;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Service.exception.UserNotExistsException;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	public UserController() {

	}

	@RequestMapping(value = "/getUserDetails", method = RequestMethod.GET)
	public User getUserDetails() throws UserNotExistsException {
		String neptuncode = getNeptuncode();

		return this.userService.getUserByLoginDatas(neptuncode);
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

}
