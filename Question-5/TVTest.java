package assignments.assignment_14.Question_5;

public class TVTest {

	public static void main(String[] args) {
		
		TV tv = new TV("Sharp");
		
		tv.isOn();
		tv.turnOn();
		tv.isOn();
		
		tv.channelUp();
		tv.channelUp();
		tv.setChannel(33);
		System.out.println(tv.getChannel());
		
		tv.setVolumeLevel(2);
		tv.volumeUp();
		System.out.println(tv.getVolumeLevel());

	}

}
