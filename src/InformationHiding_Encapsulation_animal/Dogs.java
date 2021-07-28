package InformationHiding_Encapsulation_animal;

public class Dogs {
	
	public void welcom() {
		InformationHiding_Encapsulation_zoo.Cats c = new InformationHiding_Encapsulation_zoo.Cats();
		c.makeSound();
		//c.makeHappy(); // 호출 불가
	}
}
