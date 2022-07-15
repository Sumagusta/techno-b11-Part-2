package com.kodehive.technob11.service.impl;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodehive.technob11.model.EmailModel;
import com.kodehive.technob11.model.MahasiswaModel;
import com.kodehive.technob11.repository.IMahasiswaRepository;
import com.kodehive.technob11.service.IMahasiswaService;

@Service
public class MahasiswaService implements IMahasiswaService {
	@Autowired
	IMahasiswaRepository mahasiswaRepository;
	
	public int Insert(MahasiswaModel model){
		model.setCreatedBy(getCurrentUserFromLogin());
		var result = mahasiswaRepository.insert(model);
		
		var emailModel = new EmailModel();
		var to = new ArrayList<String>();
		to.add(model.getEmail());
		emailModel.setMessage("Anda telah terdaftar pada tahun ajaran xxx");
		emailModel.setTo(to);
		emailModel.setSubject("Penerimaan Mahasiswa Baru");
		
		return result;
	}
	public String getCurrentUserFromLogin()
	{
		return "Bayu";
	}
	@Override
	public List<MahasiswaModel> readAllData() {
		
		var result = mahasiswaRepository.readAllData();
		System.out.println("select success");
		return result;
	}
	
	@Override
	public List<MahasiswaModel> searchByKeyword(String keyword) {
		// TODO Auto-generated method stub
		return mahasiswaRepository.searchByKeyword(keyword);
	}
	@Override
	public List<MahasiswaModel> searchByKeywordParam(String keyword) {
		// TODO Auto-generated method stub
		return mahasiswaRepository.searchByKeywordParam(keyword);
	}
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return mahasiswaRepository.deleteById(id);
	}
	
}
