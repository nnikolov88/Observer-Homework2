package Observer;

import java.util.ArrayList;
import java.util.List;

public class Car implements Observable {
	
	private List<Observer> observers;
	private String car;
	
	public Car() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void AddObserver(Observer observer) {
		this.observers.add(observer);
		observer.setCar(this);

	}

	@Override
	public void RemoveObserver(Observer observer) {
		this.observers.remove(observer);

	}

	@Override
	public void UpdateObservers() {
		for(Observer observer: this.observers) {
        observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.car;
	}
	
	public void setCar(String Car) {
		this.car = Car;
		this.UpdateObservers();
		}
		
}

