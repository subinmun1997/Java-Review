package Package_ClassPath;

class AAA {
	public void showName() {
		System.out.println("My name is AAA");
	}
}

class ZZZ {
	public void showName() {
		System.out.println("My name is ZZZ");
	}
}

public class WhatYourName {
	
	public static void main(String[] args) {
		AAA aaa = new AAA();
		aaa.showName();
		
		ZZZ zzz = new ZZZ();
		zzz.showName();
	}
}
