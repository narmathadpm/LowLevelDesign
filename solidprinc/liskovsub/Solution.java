package liskovsub;

public class Solution {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(2,3);
		Square sq = new Square(2);
		// in liskov, objects of a superclass should be replaceable with objects of its subclasses without breaking the application
		// to resolve this we need to create interface and common method shoukd be there. rectanble and square is same but height and width differ. so we con't replace parent object with subclass

	}
}
