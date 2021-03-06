package com.kodehive.technob11.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodehive.technob11.model.MahasiswaModel;
import com.kodehive.technob11.service.IMahasiswaService;

@Controller
public class MahasiswaController {
	@Autowired
	IMahasiswaService mahasiswaService;
	
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
	
	@RequestMapping("/mahasiswa")
	public String mahasiwa() {
		return "mahasiswa/home";
	}
	

	@RequestMapping("/insert")
	public String insertMahasiswa(MahasiswaModel model)
	{
		mahasiswaService.Insert(model);
		return "/insertSuccess";
	}
	
	@RequestMapping("/learn/jquery/search")
	@ResponseBody
	public String cariData(@RequestParam String name) {
		List<MahasiswaModel> data= mahasiswaService.cari(name);
		return "data : " + data;
	}
	
	@RequestMapping("/mahasiswa/list")
	public String mahasiswaList(Model model) {
		
		List<MahasiswaModel> mahasiswaModelList = new ArrayList<MahasiswaModel>();
		mahasiswaModelList = mahasiswaService.readAllData();
		
		model.addAttribute("mahasiswa", mahasiswaModelList);
		return "/mahasiswa/list";
	}
	
	@RequestMapping("/mahasiswa/add")
	public String mahasiswaAddModal() {
		return "/mahasiswa/add";
	}
	
	@RequestMapping("/mahasiswa/create1")
	public String mahasiswaCreate(@RequestBody MahasiswaModel model) {
		
		MahasiswaModel mahasiswaModel = new MahasiswaModel();
		mahasiswaModel.setName(model.getName());
		mahasiswaModel.setGender(model.getGender());
		mahasiswaModel.setSpp(model.getSpp());
		mahasiswaModel.setAlamat(model.getAlamat());
		
		mahasiswaService.Insert(mahasiswaModel);
		return "/mahasiswa/home";
	}
	
	@RequestMapping("/mahasiswa/create")
	public String mahasiswaCreate(HttpServletRequest request) {
		
		MahasiswaModel mahasiswaModel = new MahasiswaModel();
		mahasiswaModel.setName(request.getParameter("name"));
		mahasiswaModel.setGender(request.getParameter("jk"));
		mahasiswaModel.setSpp(Integer.valueOf(request.getParameter("spp")));
		
		mahasiswaService.Insert(mahasiswaModel);
		return "/mahasiswa/home";
	}
	
}
