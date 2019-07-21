package com.mysql.utils;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

public class Test1 {
	public static void main(String[] args) {
		//开启事物
		try {
			DataSourceUtils.startTransaction();
			// 创建QueryRunner对象
			QueryRunner qRunner = new QueryRunner(DataSourceUtils.getDataSource());
			// 编写sql
			String sqlString = "update user set user_name=?  where user_id=?";
			String sqlString1 = "insert into corporation(c_id,c_name,c_user) values(?,?,?)";
			//执行语句
//			qRunner.update(DataSourceUtils.getConnection(),sqlString);
//			qRunner.update(DataSourceUtils.getConnection(),sqlString1);
			qRunner.update(sqlString, "张三",1);
			qRunner.update(sqlString1, 2,"科创社","张三");
			//手动提交
			DataSourceUtils.commitAndRelease();
		} catch (SQLException e) {
			// 失败回滚
			try {
				DataSourceUtils.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
		
		
	}
}
