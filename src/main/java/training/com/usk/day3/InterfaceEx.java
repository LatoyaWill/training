package training.com.usk.day3;

public class InterfaceEx {

	public static void main(String[] args) {
		
		Food food = new Steak();
		food.cook();
		food.serve();
		food = new Lobster();
		food.cook();
		food.serve();

	}

}

interface Food {
	
	void cook();
	
	void serve();
}


class Steak implements Food {
	
	@Override
	public void cook() {
		System.out.println("Cooking Steak");
	}
	
	@Override
	public void serve() {
		System.out.println("Serving Steak ");
	}
}
	
class Lobster implements Food {
	
	@Override
	public void cook() {
		System.out.println("Cooking Lobster");
	}
	
	@Override
	public void serve() {
		System.out.println("Serving Lobster" );
	}

}	
