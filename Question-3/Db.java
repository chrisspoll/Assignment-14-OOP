package assignments.assignment_14.Question_3;

public class Db {
	
	private String data;
	private int yint;
	
	public void insertData(String data,int yint) {
		setData(data);
		setYint(yint);
	}

	public String getData() {
		return this.data;
	}
	
	public int getYint() {
		return this.yint;
	}
	
	public void setData(String data) {
		this.data=data;
	}
	
	public void setYint(int yint) {
		this.yint=yint;
	}
}
