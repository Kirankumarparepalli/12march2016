package com.mkyong.transaction.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.mkyong.stock.bo.StockBo;
import com.mkyong.stock.model.USERS;
import com.mkyong.transaction.TransactionBo;

public class TransactionBoImpl implements TransactionBo {

	@Autowired
	private ApplicationContext appContext;

	public String save() {

		StockBo stockBo = (StockBo) appContext.getBean("stockBo");

		/** insert **/
		USERS stock = new USERS();
		stock.setSno(1);
		stock.setName("HAIO");
		stockBo.save(stock);

		/** select **/
		/*USERS stock2 = stockBo.findByStockCode("7668");
		System.out.println(stock2);

		*//** update **//*
		stock2.setName("HAIO-1");
		stockBo.update(stock2);

		*//** delete **//*
		//stockBo.delete(stock2);
*/
		System.out.println("Done");

		return "Jersey + Spring example";

	}

}