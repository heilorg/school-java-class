package test.car;

public class Car {
	//�ʵ� (�������)
	String name;
	String owner;
	float max_oil_level;
	float mileage;
	float oil_level_gauge;
	float fuel_efficiency;
	float maxSpeed;
	
	float maxDistance;

	public Car(String n, String o, float mo, float ol, float f, float ms) {
		this.name = n;
		this.owner = o;
		this.max_oil_level = mo;
		this.oil_level_gauge = ol;
		this.fuel_efficiency = f;
		this.maxSpeed = ms;
		
		this.maxDistance = this.oil_level_gauge * this.fuel_efficiency;
	}
	
	//�޼��� (���)
	void carInfo() {
		System.out.println("�� �ڵ����� �̸��� " + name + "�Դϴ�.");
		System.out.println("�� �ڵ����� ������ " + owner + "�Դϴ�.");
		System.out.println("�� �ڵ����� �ִ� �⸧ ���� " + max_oil_level + "�����Դϴ�.");
		System.out.println("�� �ڵ����� ���� �⸧ ���� " + oil_level_gauge + "�����Դϴ�.");
		System.out.println("�� �ڵ����� �ְ� �ӵ��� �ü� " + maxSpeed + "Km/h�Դϴ�.");
		System.out.println("�� �ڵ����� ����� " + fuel_efficiency + "Km�Դϴ�.");
		System.out.println("�� �ڵ����� ������� ����Ÿ��� " + mileage + "Km�Դϴ�.");
		System.out.println("---------------------------------");
	}
	
	void move(int speed, int minute) {
		if(speed > maxSpeed) { // �ӵ��� �ִ� �ӵ����� Ŭ �� ����
			System.out.println("�ְ��ӵ��� " + maxSpeed + "Km/h�� ���� �� �����ϴ�.");
			return; // �޼��� ����
		}
		
//		float maxDistance = oil_level_gauge * fuel_efficiency; // �ִ� �̵� ���ɰŸ� = ���� �⸧��  * ����
		float distance = (minute / (float)60) * speed; //������ ���ǵ�� ���� �ð���ŭ �̵��� �Ÿ� ���
//		if(distance > maxDistance) {
//			oil_level_gauge = 0;
//			mileage = mileage + maxDistance; // ���� �̵��Ÿ��� �ִ� �̵��Ÿ�
//		}else {
//			oil_level_gauge = oil_level_gauge - (distance / fuel_efficiency); // ���� ���� �̵��Ÿ� ���
//			mileage = mileage + distance;
//		}
		this.move(distance);
	}
	
	void move(float distance) { // �޼��� �����ε� : �޼��� �̸��� ���Ƶ� ���� ���̳� �� �ڷ����� �ٸ��� �ٸ� �޼���� �ν� 
//		float maxDistance = oil_level_gauge * fuel_efficiency; // �ʵ�� ����
		if(distance > maxDistance) {
			oil_level_gauge = 0;
			mileage = mileage + maxDistance; 
		}else {
			oil_level_gauge = oil_level_gauge - (distance / fuel_efficiency);
			mileage = mileage + distance;
		}
	}
}