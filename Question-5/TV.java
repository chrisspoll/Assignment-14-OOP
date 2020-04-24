package assignments.assignment_14.Question_5;

public class TV {
	
	private int channel=1; 
	private int volumeLevel=1;
	private boolean on = false; 
	private String brand = "undefined";
	
	public TV() {
		System.out.println("Creating TV object using no Args- constructor");
	}

	public TV(String brand) {
		this.brand = brand;
		System.out.println("Creating TV object using 1 arg - constructor");
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if(channel <= 0 || channel > 120) {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}else {
			this.channel = channel;
		}	
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		if(this.on == false || volumeLevel < 1 || volumeLevel > 7) {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}else {
			this.volumeLevel = volumeLevel;
		}	
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void  channelUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}
	
	public void  volumeUp() {
		++volumeLevel;
	}
	
	public void volumeDown() {
		--volumeLevel;
	}
	
	public void turnOn() {
		if(this.on == true) {
			System.out.println("TV is already ON");
		}else {
			this.on = true;
		}
	}
	
	public void turnOff() {
		if(this.on == false) {
			System.out.println("TV is already OFF");
		}else {
			this.on = false;
		}
	}
	
	public void isOn() {
		if(this.on == true) {
			System.out.println("Yes. TV is ON.");
		}else {
			System.out.println("No. TV is OFF.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
