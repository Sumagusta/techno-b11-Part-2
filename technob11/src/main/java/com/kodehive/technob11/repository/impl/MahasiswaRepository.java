package com.kodehive.technob11.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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

	@Override
	public List<MahasiswaModel> readAllData() {

		var query = "select * from t_mahasiswa order by id desc";
		var result = jdbc.query(query, new BeanPropertyRowMapper<MahasiswaModel>(MahasiswaModel.class));
		return result;
	}

	@Override
	public List<MahasiswaModel> searchByKeyword(String keyword) {

		var query = "select * from t_mahasiswa where name like '%" + keyword + "%'";

		return jdbc.query(query, new BeanPropertyRowMapper<MahasiswaModel>(MahasiswaModel.class));
	}

	@Override
	public List<MahasiswaModel> searchByKeywordParam(String keyword) {

		var query = "select * from t_mahasiswa where name like '%" + keyword + "%'";

		return jdbc.query(query, new BeanPropertyRowMapper<MahasiswaModel>(MahasiswaModel.class));
	}

	@Override
	public int deleteById(int id) {

		var query = "delete from t_mahasiswa where id = ?";
		return jdbc.update(query, id);
	}

}
