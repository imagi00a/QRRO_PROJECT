package com.company.qrro.order.sql;

import java.util.List;
import java.util.Map;

public interface orderRepMapper {

	public int insert(Map map);
	
	public List<Map> select(Map map);
}
