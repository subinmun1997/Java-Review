package InformationHiding_Encapsulation;

class SinivelCap {
	void take() {
		System.out.println("�๰�� ��~ ���ϴ�.");
	}
}

class SneezeCap {
	void take() {
		System.out.println("��ä�Ⱑ �ܽ��ϴ�.");
	}
}

class SnuffleCap {
	void take() {
		System.out.println("�ڰ� �� �ո��ϴ�.");
	}
}

class  ColdPatient {
	void takeSinivelCap(SinivelCap cap) {
		cap.take();
	}
	void takeSneezeCap(SneezeCap cap) {
		cap.take();
	}
	void takeSnuffleCap(SnuffleCap cap) {
		cap.take();
	}
}
public class BadEncapsulation {
	public static void main(String[] args) {
		ColdPatient suf = new ColdPatient();
		
		suf.takeSinivelCap(new SinivelCap());
		suf.takeSneezeCap(new SneezeCap());
		suf.takeSnuffleCap(new SnuffleCap());
	}
}
