package com.priya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;

import com.priya.service.MpDetails;
import com.priya.entity.ManpowerDetails;
import com.priya.entity.District;
@Controller
public class ManpowerForm {
@Autowired
private MpDetails mpDetails;
@RequestMapping(value="/", method=RequestMethod.GET)
public String listManpower(ModelMap map){
	
	map.addAttribute("manpower", new ManpowerDetails());
	map.addAttribute("manpowerList", mpDetails.getAllManpower());
	return "ListofManpower";
}

@RequestMapping(value="/add", method=RequestMethod.POST)
public String addManpower(@Validated @ModelAttribute(value="manpower") ManpowerDetails manpower, BindingResult result)
{
if(result.hasErrors()){
	return "ListofManpower";
}	
System.out.println("Hi Saurabh "+manpower);
mpDetails.addManpowerDetails(manpower);;
return "redirect:/";
}


}
