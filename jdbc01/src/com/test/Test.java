package com.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class Test {
	public static void main(String[] args) throws Exception {
		String resource = "mybatis-config.xml";
//		//文本输入流
//		InputStream inputStream = Resources.getResourceAsStream(resource);
//		SqlSessionFactory sqlSessionFactory = new  SqlSessionFactoryBuilder().build(inputStream);
//		//类似于connection
//		SqlSession session = sqlSessionFactory.openSession();
//		System.out.println("获得链接对象："+session);
//		int count = session.selectOne("StudentMapper.studentCount");
//		System.out.println("查询出数据条数："+count);
	}
}
