package com.yumazhe.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yumazhe.dao.UserDao;
import com.yumazhe.pojo.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public void add(User user) {
		super.getSession().save(user);
	}

	@Override
	public void remove(User user) {
		super.getSession().delete(user);
	}

	@Override
	public void update(User user) {
		super.getSession().update(user);
	}

	@Override
	public User queryByNumber(String number) {
		return (User) super.getSession().get(User.class, number);
	}

	@Override
	public List<User> queryByPage(int start, int size) {
		Query query = super.getSession().createQuery("from User order by position,number");
		query.setFirstResult(start);
		query.setMaxResults(size);
		return query.list();
	}
	
	@Override
	public List<User> queryAll() {
		return super.getSession().createQuery("from User").list();
	}
	
	@Override
	public int getCount() {
		return super.getSession().createQuery("from User").list().size();
	}
}
