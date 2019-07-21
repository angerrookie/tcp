package com.mysql.test;

import java.util.Scanner;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.eclipse.jdt.internal.compiler.env.IGenericField;
import org.omg.CORBA.Current;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;
/**
 * 一个数能被3整除  即这个数各个数位之和能被3整除
 * */
//public class Main {
//	//12 123 1234 12345 123456 1234567 12345678 123456789 12345678910 1234567891011 123456789101112 
//	//求出各个数位之和
//	public static void main(String args[]) {
//		Scanner scanner = new Scanner(System.in);
//		
//		int start = scanner.nextInt();
//		
//		int end = scanner.nextInt();
//	
//		int count = 0;// 计数
//		for (int i = start; i <=end ; i++) {
//			if ((i+(i+1))%3!=0) {
//				count++;
//			}
//		}
//		
//		System.out.println(count);
//	}
//}
import com.sun.xml.internal.ws.api.message.saaj.SAAJFactory;

import jdk.nashorn.internal.ir.ReturnNode;

/**
 *  每个输入包含一个测试用例。
	每个测试用例的第一行包含两个正整数，分别表示工作的数量N(N<=100000)和小伙伴的数量M(M<=100000)。
	接下来的N行每行包含两个正整数，分别表示该项工作的难度Di(Di<=1000000000)和报酬Pi(Pi<=1000000000)。
	接下来的一行包含M个正整数，分别表示M个小伙伴的能力值Ai(Ai<=1000000000)。
	保证不存在两项工作的报酬相同。
 * */
//public class Main {
//	public static void main(String[] args) {
//		//需要三个数组存放工作报酬和难度和能力值
//		Scanner scanner = new Scanner(System.in);
//		//存储工作数量N和人数M
//		 String line=null;
//		String t[]=line.split(" ");
//		 int N=Integer.valueOf(t[0]);
//	     int M=Integer.valueOf(t[1]);
//		//工作难度  报酬
//		int Di[] = new int[N];
//		int Pi[] = new int[N];
//		for(int i=0;i<N;i++) {
//			Di[i] = scanner.nextInt();
//			Pi[i] = scanner.nextInt();
//		}
//		int Ai[] = new int[M];
//		for (int i = 0; i < Ai.length; i++) {
//			Ai[i] = scanner.nextInt();
//		}
//		long s = System.currentTimeMillis();
//		int temp,temp1;
//		//对难度排序
//		for (int i = 0; i < Di.length-1; i++) {
//			if (Di[i]>Di[i+1]) {
//				temp=Pi[i];
//				Pi[i]=Pi[i+1];
//				Pi[i+1]=Pi[i];
//				
//				temp1=Di[i];
//				Di[i]=Di[i+1];
//				Di[i+1]=Di[i];
//			}
//		}
//		//比对得出结果
//		int result[] = new int[M];
//		for (int i = 0; i < Ai.length; i++) {
//			for (int j = Di.length-1; j >=0 ; j--) {
//				if (choose(Ai[i], Di[j])) {
//					result[i]=Pi[j];
//					break;
//				}
//			}
//		}
//		long e = System.currentTimeMillis();
//		for (int j = 0; j < result.length; j++) {
//			System.out.println(result[j]+">>>"+(e-s));
//		}
//	}
//	static boolean choose(int a,int b) {
//		if (a-b>=0) {
//		return true;	
//		}
//		return false;
//	}
//}
///**
// * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
// * */
//public class Main{
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String s ="    helloworld";
//		s = s.replace(" ", "%20");
//		System.out.println(s);
//	}
//}
/**
 * 斐波拉契数列
 * */
//public class Main{
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
//		System.out.println(Fibonacci(n));		
//	}
//	static  int Fibonacci(int n) {
//        if(n==1||n==2){
//            return 1;
//        }else{
//            return Fibonacci(n-1)+Fibonacci(n-2);
//        }
//    }
//
//}
/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * 三种情况：
 * 		1、全是1级跳
 * 		2、全是2级跳
 * 		3、1级跳+2级跳
 * 
 * */
//public class Main{
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		while(true) {
//		int n = scanner.nextInt();
//		System.out.println(Jump(n));
//		}
//	}
//	static int Jump(int target) {
//		int count=1,count1=2,count2=0;//1和2的数量
//		if(target<0){
//            return 0;
//        }else if(target==1){
//            return 1;
//        }else if(target==2){
//            return 2;
//        }else{
//        	
//        	for (int i = 3; i <=target ; i++) {
//				count2 = count+count1;
//				count=count1;
//				count1=count2;
//			}
//        	return count2;
////        	count1=target;
////        	//2 2 -- 1 1    2
////        	//4 2 2--2 1 1(3)-->5 2*2+(2-1)
////        	//6 2 2 2-->2 2 1 1(6)--2 1 1 1 1(5)--13  5*2+(5-2)
////        	//8 2 2 2 2-->2 2 2 1 1(4+3+2+1)-->2 2 1 1 1 1(5+4+3+2+1)-->2 1 1 1 1 1 1(7)--34  13*2+(13-5)
////            //偶数
////        	if (target%2==0) {
////            	if (target==4) {
////					return 5;
////				}
////				return Jump(target-2)*2+Jump(target-2)-Jump(target-4);
////			}else {
////				//奇数
////				//3 2 1 (1+2)3
////				//5 1 2 2-->1 1 1 2(1+4+3)8
////				//7 1 2 2 2(4)-->1 1 1 2 2(4+6)-->1 1 1 1 1 2(6)-->(21)
////				//9 1 2 2 2 2(5)-->1 1 1 2 2 2(42)
////			}
//        }
//	}
//}
//public class Main{
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		while(true){
//			int b = scanner.nextInt();
//			System.out.println(JumpFloorII(b));
//		}
//	}
//	static int JumpFloorII(int n) {
//		int b=1;
//		if (n==1) {
//			return 1;
//		}else {
//			for (int i = 1; i < n; i++) {
//				b=2*b;
//			}
//			return b;
//		}
//	}
//}
//public class Main{
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		while(true){
//			int b = scanner.nextInt();
//			System.out.println(count(b));
//		}
//	}
//
//	static int count(int target) {
//		
//		if(target==0){
//		       return 0;
//		    }else if (target==1) {
//					return 1;
//				}else {
//				  return (target/2)+1;
//				}
//		    }
//}

//public class Main{
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		while(true){
//			int b = scanner.nextInt();
//			System.out.println(Power(2.5,b));
//		}
//	}
//	static double Power(double base, int exponent) {
//		
//		double b=1;
//		if (exponent==0) {
//			return 1;
//		}
//		if (exponent>0) {
//			for (int i = 0; i < exponent; i++) {
//				b=b*base;
//			}
//		}else {
//			b=Math.pow(base, exponent);
//		}
//		return b;
//        
//	  }
//}

public class Main{

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a[] = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		reOrderArray(a);
	}
	static  void reOrderArray(int [] array) {
        int b[] = new int[10];
        int c[] = new int[10];
        int count1=0,count2=0;
        for (int i = 0; i < array.length; i++) {
			if (array[i]%2==0) {
				b[count1]=array[i];
				count1++;
			}else {
				c[count2]=array[i];
				count2++;
			}
		}
        for (int i = 0; i < b.length; i++) {
			array[i]=b[i];
		}
        for (int i = count1; i < array.length; i++) {
			array[i]=c[i];
		}
        for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
    }
}