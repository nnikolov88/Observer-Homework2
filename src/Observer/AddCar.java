package Observer;

public class AddCar implements Observer {

	private String name;
	private Observable car;
	
	
	public AddCar(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.car == null) {
			
			System.out.println(this.getName()+ " No available car.");
			return; 
		}
		String latestCar = this.car.getUpdate();
		System.out.println(this.getName()+ " New update: " + latestcar);
	}

	@Override
	public void setCar(Observable car) {
		this.book = car;

	}

	public String getName() {
		return name;
	}
	
}
