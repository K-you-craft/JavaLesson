package abstrctKadai;

public abstract class Device {
	final void powerOn() {
		System.out.println("電源を入れました");
	}
	
	abstract void useDevice();

}
