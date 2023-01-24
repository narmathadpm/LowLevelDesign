package liskovsub;

public class Square1 implements Shape{
	private int side;
	Square1(int side)
	{
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int computeArea()
	{
		return side*side;
	}
}
