package com.company.qrro.pos.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.company.qrro.pos.dao.PosCreateDao;

@Service
@EnableTransactionManagement
public class PosCreateServiceImpl implements PosCreateService{

	@Autowired
	
	PosCreateDao posCreateDao;
	
	@Override
	@Transactional(
			readOnly = false
			,propagation = Propagation.REQUIRES_NEW
			,rollbackFor = {Exception.class}
			)
	public void create(Map map) throws Exception {
		
		if (posCreateDao.checkAdId()) {
			
			throw new Exception("관리자 계정이 이미 존재합니다.");
		}
		
		int result = posCreateDao.create(map);
		if ( 1 != result ) {
			throw new Exception("계정 생성 실패");
	}
	}
}
