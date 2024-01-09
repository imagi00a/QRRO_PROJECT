package com.company.qrro.pos.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.qrro.pos.sql.PosCreateMapper;

@Repository
public class PosCreateDaoImpl implements PosCreateDao {
	
	@Autowired
	SqlSession sqlSession;

	@Override
	public int create(Map map) {
		PosCreateMapper mapper = sqlSession.getMapper(PosCreateMapper.class);
		return mapper.create(map);
	}

	@Override
	 public boolean checkAdId() {
        PosCreateMapper mapper = sqlSession.getMapper(PosCreateMapper.class);
        int count = mapper.checkAdId();
        return count > 0;
	}

}
