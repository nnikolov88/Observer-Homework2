package Observer;

public class MainClass {

	public static void main(String[] args) {
		
		
		Book book = new Car();
		Observer obs1 = new AddCar("Owner 1");
		Observer obs2 = new AddCar("Owner 2");
		Observer obs3 = new AddCar("Owner 3"); 
		
		car.AddObserver(obs1);
		car.AddObserver(obs2);
		car.AddObserver(obs3);
		
		car.setCar("");

	}

}
