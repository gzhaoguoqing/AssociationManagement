package com.yumazhe.dao;

import java.util.List;

import com.yumazhe.pojo.Notice;

public interface NoticeDao{
	public void add(Notice notice);
	
	public void remove(Notice notice);
	
	public void update(Notice notice);
	
	public Notice queryById(int id);
	
	public List<Notice> queryByPage(int start, int size);
	
	public List<Notice> queryAll();
}
