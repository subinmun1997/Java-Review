package InformationHiding_Encapsulation_zoo;

public class Cats {
	public void makeSound() { // public으로 선언된 메소드, 따라서 어디서든 호출 가능
		System.out.println("야옹");
	}
	void makeHappy() { // default로 선언된 메소드, 따라서 동일 패키지에서만 호출 가능
		System.out.println("스마일");
	}
}
