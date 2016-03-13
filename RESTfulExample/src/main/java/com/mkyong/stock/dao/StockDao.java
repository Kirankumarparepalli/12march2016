package com.mkyong.stock.dao;

import com.mkyong.stock.model.USERS;

public interface StockDao {
	
	void save(USERS stock);
	void update(USERS stock);
	void delete(USERS stock);
	USERS findByStockCode(String stockCode);

}