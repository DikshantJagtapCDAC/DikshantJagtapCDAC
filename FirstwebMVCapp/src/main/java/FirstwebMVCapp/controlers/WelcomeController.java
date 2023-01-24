package FirstwebMVCapp.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController
{
	@RequestMapping("/welcome")
	public String welcomePage()
	{
		return "welcome"; // view to be display
		
	}
	

}
