package liskovsub;

public class Rectangle1 implements Shape{
	private int height;
	private int width;

	Rectangle1(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int computeArea(){
		return this.width * this.height;
	}
}
