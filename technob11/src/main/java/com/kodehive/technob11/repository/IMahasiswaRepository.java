package com.kodehive.technob11.repository;

import java.util.List;

import com.kodehive.technob11.model.MahasiswaModel;

public interface IMahasiswaRepository {
	
	public int insert(MahasiswaModel model);
	
	public List<MahasiswaModel> readAllData();
}
