package OpenClose;

public class ISSubscriber extends Subscriber{
    private int freeUsage;

	public int getFreeUsage() {
		return freeUsage;
	}

	public void setFreeUsage(int freeUsage) {
		this.freeUsage = freeUsage;
	}

	// open for modifticaion
	@Override
	public void calculatebill() {
		System.out.println(getCost() + getFreeUsage());
	}
}
