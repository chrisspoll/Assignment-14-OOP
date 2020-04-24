package assignments.assignment_14.Question_6;

public class Test {

	public static void main(String[] args) {
		
		ParkingMeter p = new ParkingMeter(40);
		
		p.add(25);
		System.out.println(p.getTimeLeft());
		
		System.out.println(p.isExpired());
		
		p.tick();
		p.tick();
		p.tick();
		
		System.out.println(p.getTimeLeft());
		

	}

}
