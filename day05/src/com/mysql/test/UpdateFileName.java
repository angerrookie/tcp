package com.mysql.test;

import java.io.File;

public class UpdateFileName {

	public static String  rename(String oldnmae,String newname) {
		
		File file = new File(oldnmae);
		
		File file2 = new File(newname);
		
		return file.renameTo(file2)? "修改成功": "修改失败";
	}
	
	public static void main(String[] args) {
		System.out.println("Result:"+rename("C:"+File.separator+"t.txt", "C:"+File.separator+"test.txt"));
	}
}
