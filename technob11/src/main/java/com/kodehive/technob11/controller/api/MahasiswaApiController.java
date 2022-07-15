package com.kodehive.technob11.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/getDataByKeyword/{keyword}")
	public List<MahasiswaModel> getAllData(@PathVariable String keyword) {
		
		return mahasiswaService.searchByKeyword(keyword);
	}
	
	@GetMapping("/getDataByKeyword")
	public List<MahasiswaModel> getAllDataKeywordWithQueryString(@RequestParam String keyword) {
		
		return mahasiswaService.searchByKeywordParam(keyword);
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestParam int id) {
		return "successfully delete "+mahasiswaService.delete(id);
	}
}
