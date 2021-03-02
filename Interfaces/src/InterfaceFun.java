
interface WaterBottleInterface {
	
	String color = "Blue";
	
	void fillUp();
	void pourOut();
}

public class InterfaceFun implements WaterBottleInterface {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("The bottle is " + color);
		
		InterfaceFun ex = new InterfaceFun();
		Thread.sleep(1000);
		ex.fillUp();
		Thread.sleep(1000);
		ex.pourOut();
		
	}

	@Override
	public void fillUp() {
		System.out.println("Bottle is filled");
		
	}

	@Override
	public void pourOut() {
		System.out.println("Bottle is poured out");
		
	}

}
