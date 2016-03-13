package com.mkyong.stock.bo.impl;

import com.mkyong.stock.bo.StockBo;
import com.mkyong.stock.dao.StockDao;
import com.mkyong.stock.model.USERS;

public class StockBoImpl implements StockBo{
	
	StockDao stockDao;
	
	public void setStockDao(StockDao stockDao) {
		this.stockDao = stockDao;
	}

	public void save(USERS stock){
		stockDao.save(stock);
	}
	
	public void update(USERS stock){
		stockDao.update(stock);
	}
	
	public void delete(USERS stock){
		stockDao.delete(stock);
	}
	
	public USERS findByStockCode(String stockCode){
		return stockDao.findByStockCode(stockCode);
	}
}