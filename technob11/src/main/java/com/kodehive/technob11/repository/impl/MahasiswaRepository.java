package com.kodehive.technob11.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kodehive.technob11.model.MahasiswaModel;
import com.kodehive.technob11.repository.IMahasiswaRepository;

@Repository
public class MahasiswaRepository implements IMahasiswaRepository {

	@Autowired
	JdbcTemplate jdbc;

	@Override
	public int insert(MahasiswaModel model) {
		var query = "insert into t_mahasiswa(name, gender, alamat, spp)" + "values (?,?,?,?)";
		return jdbc.update(query,
				new Object[] { model.getName(), model.getGender(), model.getAlamat(), model.getSpp() });
	}

}
