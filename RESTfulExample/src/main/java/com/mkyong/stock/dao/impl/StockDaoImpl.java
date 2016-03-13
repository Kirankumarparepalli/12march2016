package com.mkyong.stock.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mkyong.stock.dao.StockDao;
import com.mkyong.stock.model.USERS;

public class StockDaoImpl extends HibernateDaoSupport implements StockDao {

	public void save(USERS stock) {
		getHibernateTemplate().save(stock);
	}

	public void update(USERS stock) {
		getHibernateTemplate().update(stock);
	}

	public void delete(USERS stock) {
		getHibernateTemplate().delete(stock);
	}

	public USERS findByStockCode(String stockCode) {
		List list = getHibernateTemplate().find("from Stock where stockCode=?", stockCode);
		return (USERS) list.get(0);
	}

}