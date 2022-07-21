package com.kodehive.technob11.repository;

import java.util.List;

import com.kodehive.technob11.model.MahasiswaModel;

public interface IMahasiswaRepository {
	
	public int insert(MahasiswaModel model);
	
	public List<MahasiswaModel> readAllData();
	
	public List<MahasiswaModel> searchByKeyword(String keyword);
	
	public List<MahasiswaModel> searchByKeywordParam(String keyword);
	
	public int deleteById(int id);
	
	public List<MahasiswaModel> cari(String name);
	
	
}
