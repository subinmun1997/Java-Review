package InformationHiding_Encapsulation_zoo;

class Duck { // default class 동일 패키지에서만 인스턴스 생성 가능
	
}

public class Cat { // public class 어디서든 인스턴스 생성 가능
	public void makeCat() {
		Duck quack = new Duck(); // Duck과 같은 패키지로 묶여 있어 인스턴스 생성 가능
	}
}
