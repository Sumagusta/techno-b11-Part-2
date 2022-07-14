package com.kodehive.technob11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodehive.technob11.model.MahasiswaModel;
import com.kodehive.technob11.service.IMahasiswaService;

@Controller
public class MahasiswaController {
	@Autowired
	IMahasiswaService MahasiswaService;
	
	@RequestMapping("/view")
	public String view() {
		return "/home";
	}
	

	@RequestMapping("/insert")
	public String insertMahasiswa(MahasiswaModel model)
	{
		MahasiswaService.Insert(model);
		return "/insertSuccess";
	}
	
	
	
}
