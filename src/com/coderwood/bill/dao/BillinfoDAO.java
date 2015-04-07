package com.coderwood.bill.dao;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import com.coderwood.bill.entity.Billinfo;

@Service
public class BillinfoDAO {

	private static SqlSessionFactory sqlSessionFactory;
	private static Reader reader;

	static {
		try {
			reader = Resources.getResourceAsReader("configuration.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSession() {
		return sqlSessionFactory;
	}


	public List<Billinfo> selectAll() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			List<Billinfo> billItems = session.selectList("com.coderwood.bill.mapper.BillinfoMapper.selectAll");
			return billItems;
		} finally {
			session.close();
		}
	}
}
