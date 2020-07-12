package com.cjy.cncom.cjy.cn1;

import com.cjy.cn.Kid;

public class KidCircle {
	public int count;
	public Kid first;
	public  Kid last;
	
	public KidCircle(int count) {
		for(int i=0;i<count;i++) {
			this.add();
		}
	}
	public void add() {
		Kid k=new Kid();
		if(this.count<=0) {
			this.first=k;
			this.last=k;
			k.left=k;
			k.right=k;
		}else {
			last.right=k;
			k.left=last;
			k.right=first;
			this.last=k;
			first.left=k;
		}
		this.count++;
		k.id=this.count;
	}
	public void delete(Kid k) {
		if(this.count<=0) {
			System.out.println("没有可以删除的kid");
			return;
		}else if(this.count==1) {
			first=last=null;
		}else {
			k.left.right=k.right;
			k.right.left=k.left;
			if(k==first) {
				first=k.right;
			}
			if(k==last) {
				last=k.left;
			}
		}
		this.count--;
	}
}
