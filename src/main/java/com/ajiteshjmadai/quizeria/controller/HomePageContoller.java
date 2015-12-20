/**
 * 
 */
package com.ajiteshjmadai.quizeria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ajitesh
 *
 */

@Controller
@RequestMapping(value = "/")
public class HomePageContoller {

		@RequestMapping(method = RequestMethod.GET)
		public String loadHomePage() {
			
			return "index";
			
			
		}
}
