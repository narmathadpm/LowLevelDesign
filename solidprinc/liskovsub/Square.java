package liskovsub;

public class Square extends Rectangle{
	Square(int side)
	{
		super(side,side);
	}
	@Override
	public void setHeight(int height) {
		setSide(height);
	}

	@Override
	public void setWidth(int width) {
		setSide(width);
	}

	public void setSide(int side)
	{
		super.setHeight(side);
		super.setWidth(side);
	}


}
