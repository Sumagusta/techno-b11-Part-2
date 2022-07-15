package com.kodehive.technob11.service;

import java.util.List;

import com.kodehive.technob11.model.MahasiswaModel;

public interface IMahasiswaService {
	int Insert(MahasiswaModel model);
	
	public List<MahasiswaModel> readAllData();
}
