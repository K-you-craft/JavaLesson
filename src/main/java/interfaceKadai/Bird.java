package interfaceKadai;

public class Bird implements Flyable , Animal{

	@Override
	public void fly() {
		System.out.println("小鳥は空を翔けています");
	}

	@Override
	public void makeSound() {
		System.out.println("チュンチュン！");
		
	}
	
}
