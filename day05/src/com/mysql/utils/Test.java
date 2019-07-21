package com.mysql.utils;

import java.nio.channels.NonReadableChannelException;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.sun.org.apache.bcel.internal.generic.NEW;

import sun.print.resources.serviceui;

public class Test {
	public static void main(String[] args) throws SQLException {
		// 创建QueryRunner对象
		QueryRunner qRunner = new QueryRunner(DataSourceUtils.getDataSource());
		// 增加数据
//		String sqlString = "insert into user(user_name,user_pass,stu_number,user_email) values(?,?,?,?)";
//		int a = qRunner.update(sqlString, "李四", "111", "1111", "11111");
//		System.out.println(">>>>>>>" + a);
		//修改数据
//		String sqlString = "update user set user_name=? where user_id=?";
//		int bString =  qRunner.update(sqlString,"王五",1);
//		System.out.println(">>>>>"+bString);
		
//		String sqlString = "delete from user where user_id=?";
//		int c = qRunner.update(sqlString,2);
//		System.out.println(">>>>>>"+c);
		
		//查询数据
		//查询结果为一行
//		String sqlString = "select * from user where user_id=?";
//		User user = qRunner.query(sqlString, new BeanHandler<>(User.class), 1);
//		System.out.println(user.getUser_name());			
		//查询结果为多行
//		String sqlString = "select * from user";
//		List<User> user = qRunner.query(sqlString, new BeanListHandler<>(User.class));
//		for (User string : user) {
//			System.out.println(string.getUser_name());
//		}
		
		//查询结果为聚合函数
		String string = "select count(*) from user";
		Object qObject = ((Long) (qRunner.query(string, new ScalarHandler()))).intValue();
		System.out.println(qObject);
	}
	
}
