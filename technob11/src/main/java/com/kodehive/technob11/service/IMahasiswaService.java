package com.kodehive.technob11.service;

import java.util.List;

import com.kodehive.technob11.model.MahasiswaModel;

public interface IMahasiswaService {
	int Insert(MahasiswaModel model);
	
	public List<MahasiswaModel> readAllData();
	
	public List<MahasiswaModel> searchByKeyword(String keyword);

	public List<MahasiswaModel> searchByKeywordParam(String keyword);
	
	public int delete(int id);
}
