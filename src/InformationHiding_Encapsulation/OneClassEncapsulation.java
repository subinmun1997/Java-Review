package InformationHiding_Encapsulation;

class SinusCap {
	void sniTake() {
		System.out.println("�๰�� ��~ ���ϴ�.");
	}
	
	void sneTake() {
		System.out.println("��ä�Ⱑ �ܽ��ϴ�.");
	}
	
	void snuTake() {
		System.out.println("�ڰ� �� �ո��ϴ�.");
	}
	
	void take() {
		sniTake();
		sneTake();
		snuTake();
	}
}

class ColdPatient2 {
	void takeSinus(SinusCap cap) {
		cap.take();
	}
}

public class OneClassEncapsulation {
	
	public static void main(String[] args) {
		ColdPatient2 suf = new ColdPatient2();
		suf.takeSinus(new SinusCap());
	}
}
