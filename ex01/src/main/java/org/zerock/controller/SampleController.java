package org.zerock.controller;

import java.awt.List;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.jws.WebParam.Mode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zerock.domain.SampleDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {

	@RequestMapping(value = "/basic", method = {RequestMethod.GET, RequestMethod.POST})
	public void basicGet() {
		
		log.info("basic get..............");
		
	}
	
	@RequestMapping("/basicOnlyGet")
	public void basicGet2() {
		log.info("basic get only get.........");
	}
	
	@GetMapping("/ex01")
	public String ex01(SampleDTO dto) {
		log.info("" + dto);
		return "ex01";
	}
	
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("userName", "moon");
		return "hello";
	}
	
}
