package assignments.assignment_14.Question_7;

public class GasTank {
	
	private double amount = 0;
	private double capacity;
	
	public GasTank(double capacity) {
		this.capacity = capacity;
	}
	
	public void addGas(double value) {
		this.amount = this.amount + value;
		
		if(this.amount > this.capacity) {
			this.amount  = this.capacity;
		}
	}
	
	public void useGas(double value) {
		this.amount = this.amount - value;
		
		if(this.amount < 0) {
			this.amount = 0;
		}
	}
	
	public boolean isEmpty(){
		if(this.amount < 0.1) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(this.amount > (this.capacity - 0.1)) {
			return true;
		}
		return false;
	}
	
	public double getGasLevel() {
		return this.amount;
	}
	
	public double fillUp() {
		double difference = this.capacity - this.amount;
		this.amount = this.capacity;
		return difference;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
