package assignments.assignment_14.Question_6;

public class ParkingMeter {

	private int timeLeft;
	private int maxTime;
	
	public ParkingMeter(int maxTime) {
		this.timeLeft = 0;
		this.maxTime = maxTime;
	}
	
	public boolean add(int value) {
		if(value==25 && (value+timeLeft)<=maxTime) {
			this.timeLeft += 30;
			return true;
		}
		return false;
	}
	
	public void tick() {
		if(timeLeft>0) {
			--timeLeft;
		}
	}
	
	public boolean isExpired() {
		if(timeLeft == 0) {
			return true;
		}
		return false;
	}

	public int getTimeLeft() {
		return timeLeft;
	}

	public void setTimeLeft(int timeLeft) {
		this.timeLeft = timeLeft;
	}

	public int getMaxTime() {
		return maxTime;
	}

	public void setMaxTime(int maxTime) {
		this.maxTime = maxTime;
	}
	
	
}
