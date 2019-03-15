import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.user.UserDAOImpl;
import com.spring.user.UserPOJO;

@Controller
public class LoginController 
{
	
	@Autowired
	  UserDAOImpl userService;


	 @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("login") LoginPOJO login) 
	 {
	    ModelAndView mav = null;
	    UserPOJO user = userService.validateUser(login);
	    
		    if (null != user)
		    {
				    mav = new ModelAndView("Comment");
				    mav.addObject("Email", user.getEmail());
		    }
		    else 
		    {
				    mav = new ModelAndView("Azaan");
				    mav.addObject("message", "Username or Password is wrong!!");
		    }
		    return mav;
}
}
