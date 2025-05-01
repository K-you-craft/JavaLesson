package abstrctKadai;

public abstract class KitchenAppliance extends Appliance{

	@Override
	void turnOn() {
		System.out.println("キッチン家電の電源を入れました。");
	}
}
