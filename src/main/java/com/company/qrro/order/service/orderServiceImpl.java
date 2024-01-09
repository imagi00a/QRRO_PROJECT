package com.company.qrro.order.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.company.qrro.order.dao.orderDao;
import com.company.qrro.common.file.service.CommonFileService;

@Service
@EnableTransactionManagement
public class orderServiceImpl implements orderService {

	@Autowired
	orderDao orderDao;

	@Override  
	public int login(Map map) {

		int result = 0; 

		if (orderDao.select(map) != null) {
			result = 1;
			map.put("loginSeceess", "로그인 성공");
		} else {
			map.put("loginerror", "로그인 실패");
		}
		return result;
	}

}
