public class Facility {
	private String name;
	private int capacity;
	
	Facility(String name, int capacity){
		this.name=name;
		this.capacity=capacity;
	}
	String getName() {
		return name;
	}
	int getCapacity() {
		return capacity;
	}
	void setName(String name) {
		this.name=name;
	}
	void setCapacity(int capacity) {
		this.capacity=capacity;
	}
}
