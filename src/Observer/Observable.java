package Observer;

public interface Observable {

	void AddObserver(Observer observer);
	void RemoveObserver(Observer observer);
	
	void UpdateObservers();
    String getUpdate();
}