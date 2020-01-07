package test.car;

public class Sedan extends Car implements Driveable {
	private String color;
	public Sedan(String name, Owner owner, float max_oil_level, float oil_level_gauge, float fuel_efficiency, float maxSpeed, String color) {
		super(name, owner, max_oil_level, oil_level_gauge, fuel_efficiency, maxSpeed);
		this.setColor(color);
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public boolean chkLicense() {
		if(super.getOwner().getLicense().equals(Driver.LICENSE_BIG) || super.getOwner().getLicense().equals(Driver.LICENSE_NO1) || super.getOwner().getLicense().equals(Driver.LICENSE_NO2)) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	void move(int speed, int minute) {
		if(chkLicense()) {
			super.move(speed, minute);
		}else {
			System.out.println("������ ������ �������� ��� ������ �� �����ϴ�.");
		}
	}
	
	@Override
	void move(float distance) {
		if(chkLicense()) {
			super.move(distance);
		}else {
			System.out.println("������ ������ �������� ��� ������ �� �����ϴ�.");
		}		
	}
}