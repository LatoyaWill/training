package training.com.usk.day3;

public class AbstractClassEx {

	public static void main(String args[]) {
		
		Fruit fruit = new Lime();
		fruit.taste();
		fruit.color();
		
				
	}

}

abstract class Fruit {
	
	public void taste() {
		
		System.out.println("Sour");
		
	}
		
	public abstract void color(); 
	
}
	

class Lime extends Fruit {
	
	public void color() {
		
		System.out.println("green");
	}
}
