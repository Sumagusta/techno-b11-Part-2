package com.kodehive.technob11.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodehive.technob11.model.MahasiswaModel;
import com.kodehive.technob11.service.IMahasiswaService;

@RestController
@RequestMapping("/api")
public class MahasiswaApiController {
	
	@Autowired
	IMahasiswaService mahasiswaService;

	@PostMapping("/insert")
	public String insertMahasiswa(@RequestBody MahasiswaModel mahasiswaModel) {
		mahasiswaService.Insert(mahasiswaModel);
		return "insert success";
	}
	
	@GetMapping("/getAll")
	public List<MahasiswaModel> getAllData() {
		
		return mahasiswaService.readAllData();
	}
}
