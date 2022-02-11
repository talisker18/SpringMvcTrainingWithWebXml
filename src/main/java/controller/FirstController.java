package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



/*
 * 
 * here we do not need App class and Initializer class
 * 
 * do everything in web.xml AND App-servlet.xml
 * 
 * */

@Controller
public class FirstController {
	
	@ResponseBody //bind the return value to web response (HttpServletResponse)
	@RequestMapping("first")
	public String getFromFrontEnd(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println(req.getParameter("sid"));
		return req.getParameter("sid")+", "+req.getParameter("sname");
	}
	
	@RequestMapping("second")
	public int getLogic() {
		return 0;
	}

}
