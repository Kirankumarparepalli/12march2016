package com.mkyong.stock.bo;

import com.mkyong.stock.model.USERS;

public interface StockBo {

	void save(USERS stock);

	void update(USERS stock);

	void delete(USERS stock);

	USERS findByStockCode(String stockCode);
}