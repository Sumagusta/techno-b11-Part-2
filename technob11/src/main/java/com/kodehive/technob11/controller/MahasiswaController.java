package com.kodehive.technob11.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping("/img")
	public String img1() {
		return "/static/img/1";
	}
	
	@RequestMapping("/learn/html")
	public String html() {
		return "/learn_html";
	}
	
	@RequestMapping("/learn/js")
	public String javascript() {
		return "/learn_js";
	}
	
	@RequestMapping("/learn/css")
	public String css() {
		return "/learn_css";
	}
	
	@RequestMapping("/learn/jquery")
	public String jquery() {
		return "/learn_jquery";
	}
	
	@RequestMapping("/learn/jquery/task")
	public String jqueryTask() {
		return "/jquery_task";
	}
	

	@RequestMapping("/insert")
	public String insertMahasiswa(MahasiswaModel model)
	{
		MahasiswaService.Insert(model);
		return "/insertSuccess";
	}
	
	@RequestMapping("/learn/jquery/search")
	@ResponseBody
	public String cariData(@RequestParam String name) {
		List<MahasiswaModel> data= MahasiswaService.cari(name);
		return "data : " + data;
	}
	
}
