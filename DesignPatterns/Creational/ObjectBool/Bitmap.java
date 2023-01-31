package Creational.ObjectBool;

import java.awt.geom.Point2D;

public class Bitmap implements  Image{
	private Point2D point;
	String fileName;
	Bitmap(String fileName)
	{
		this.fileName = fileName;

	}
	public void draw()
	{

	}

	public Point2D getLocation()
	{
		return point;
	}

	public void setLocation(Point2D point){
       this.point = point;
	}

	public void reset()
	{
		this.point = null;
	}
}
