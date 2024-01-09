package com.company.qrro.order.sql;

import java.util.List;
import java.util.Map;

public interface orderMapper {
	
	public Map selectTotalCnt(Map map);
	
	public Map select(Map map);
	
	public int write(Map map);
	
	public int delete(Map map);
	
	public int update(Map map);
	
	public int updateRec(Map map);
}
