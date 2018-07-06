package com.yumazhe.service;

import java.util.List;

import com.yumazhe.pojo.IncomeOrPayout;

public interface IncomeOrPayoutService {
	public void add(IncomeOrPayout incomeOrPayout);

	public void remove(IncomeOrPayout incomeOrPayout);
	
	public IncomeOrPayout queryById(int id);
	
	public List<IncomeOrPayout> queryAll();
}
