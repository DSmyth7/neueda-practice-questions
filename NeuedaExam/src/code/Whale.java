package code;

public class Whale extends Animal{
	private String mainOcean;
	private int weight, maxSpeed, length;
	
	public Whale() {
		super();
	}

	public Whale(String name, String mainOcean, int weight, int maxSpeed, int length) {
		super(name);
		this.mainOcean = mainOcean;
		this.weight = weight;
		this.maxSpeed = maxSpeed;
		this.length = length;
	}
	
	public String toString() {
		return String.format("Name: %s\nMain Ocean: %s\nWeight (tonnes): %d\nMax Speed: %d\nLength: %d", this.getName(), this.getMainOcean(), this.getWeight(), this.getMaxSpeed(), this.getLength());
	}

	public String getMainOcean() {
		return mainOcean;
	}

	public void setMainOcean(String mainOcean) {
		this.mainOcean = mainOcean;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	
}
