package assignments.assignment_14.Question_12;

public class CameraPhone extends Phone{

	private int imageSize;
	private int memorySize;
	
	public CameraPhone(int imageSize, int memorySize) {
		this.imageSize = imageSize;
		this.memorySize = memorySize;
	}
	
	public int numPictures() {
		return memorySize * 1000 / imageSize;
	}
	
	public static void main(String[] args) {
		CameraPhone p = new CameraPhone(2, 3);
		
		System.out.println(p.numPictures());
	}
}
