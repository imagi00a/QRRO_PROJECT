package com.company.qrro.order.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.qrro.order.sql.orderMapper;

@Repository
public class orderDaoImpl implements orderDao {

	@Autowired
	SqlSession sqlSession;

	@Override
	public Map selectTotalCnt(Map map) {
		orderMapper mapper = sqlSession.getMapper(orderMapper.class);
		return mapper.selectTotalCnt(map);
	}

	@Override
	public Map select(Map map) {
		orderMapper mapper = sqlSession.getMapper(orderMapper.class);
		return mapper.select(map);
	}

	@Override
	public int write(Map map) {
		orderMapper mapper = sqlSession.getMapper(orderMapper.class);
		return mapper.write(map);
	}

	@Override
	public int delete(Map map) {
		orderMapper mapper = sqlSession.getMapper(orderMapper.class);
		return mapper.delete(map);
	}

	@Override
	public int update(Map map) {
		orderMapper mapper = sqlSession.getMapper(orderMapper.class);
		return mapper.update(map);
	}

	@Override
	public int updateRec(Map map) {
		orderMapper mapper = sqlSession.getMapper(orderMapper.class);
		return mapper.updateRec(map);
	}

}
