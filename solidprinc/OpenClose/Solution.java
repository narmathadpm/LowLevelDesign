package OpenClose;

public class Solution {
	public static void main(String[] args) {
		ISSubscriber obj = new ISSubscriber();
		obj.setCost(4);
		obj.setFreeUsage(2);
		PhoneSubscriber obj1 = new PhoneSubscriber();
		obj1.setCost(4);
		obj.calculatebill();
		obj1.calculatebill();
	}
}
