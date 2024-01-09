package com.company.qrro.pos.dao;

import java.util.Map;

public interface PosCreateDao {

	public int create(Map map);
	
	 // 관리자 계정의 존재 여부를 확인하는 메서드
    boolean checkAdId();
	
}
