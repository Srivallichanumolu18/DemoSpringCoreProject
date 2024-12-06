package AutoWiringDemo;

public class Restaurant 
{
	private String name;
	private String location;
	private int capacity;
	private String rating;
	private Chef chef;
	
	public Restaurant(String name, String location, int capacity, String rating, Chef chef) {
		super();
		this.name = name;
		this.location = location;
		this.capacity = capacity;
		this.rating = rating;
		this.chef = chef;
	}
	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", location=" + location + ", capacity=" + capacity + ", rating=" + rating
				+ ", chef=" + chef + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public Chef getChef() {
		return chef;
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}

}
