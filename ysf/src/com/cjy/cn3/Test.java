package com.cjy.cn3;

import java.util.Scanner;

import com.cjy.cn.Kid;
import com.cjy.cncom.cjy.cn1.KidCircle;

public class Test {
	public static void main(String[] args) {
		System.out.println("欢迎来到cjy小游戏！");
		System.out.println("请输入人数：");
		Scanner sc =new Scanner(System.in);
		int count=sc.nextInt();
		System.out.println("请输入停止数字：");
		sc =new Scanner(System.in);
		int stop=sc.nextInt();
		sc.close();
		int countnum=0;
		KidCircle kc=new KidCircle(count);
		Kid k=kc.first;
		while(kc.count>1) {
			countnum++;
			if(countnum==stop) {
				countnum=0;
				System.out.println(k.id);
				kc.delete(k);
			}
			k=k.right;
		}
		System.out.println("胜利者——>"+k.id);
		
	}

}
