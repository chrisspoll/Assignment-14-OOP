package assignments.assignment_14.Question_8;

public class Value {

	private int value;
	int x = 0;
	int y = 0;
	
	public Value(int num) {
		this.value = num;
		y = 1;
	}
	
	public Value() {
		
	}

	public int getValue() {
		if(x == 1 || y == 1) {
			return value;
		}else {
			return 0;
		}
		
	}

	public void setValue(int value) {
		this.value = value;
		x = 1;
		
	}
	
	public boolean wasModified() {
		if(x == 0) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Value num = new Value();
		num.setValue(8);
		System.out.println(num.getValue());
		System.out.println(num.wasModified());
	}
}
