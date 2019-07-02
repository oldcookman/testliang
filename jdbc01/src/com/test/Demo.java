package com.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;





public class Demo {
	public static void main(String[] args) throws Exception {
		String resouse = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resouse);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//类似于获得链接
		SqlSession session =  sqlSessionFactory.openSession();
		//获得链接对象
		System.out.println(session);
		//执行sql语句
		Integer count = session.selectOne("StudentMapper.studentCount");
		System.out.println("学生个数:"+count);
		//一定要关掉session
		session.close();
	}
}
