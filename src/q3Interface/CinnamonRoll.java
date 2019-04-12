package q3Interface;

public class CinnamonRoll implements BakedGoods {
	private int price;
	private String desc;
	private String sellByDate;
	
	public CinnamonRoll(int price, String desc, String sellByDate) {
		this.price = price;
		this.desc = desc;
		this.sellByDate = sellByDate;
	}
	
	@Override
	public int getPrice() {
		return  price;
	}

	@Override
	public String getDescription() {
		return "A cinnamon roll to die for. " + desc;
	}

	@Override
	public String getSellByDate() {
		return sellByDate;
	}
}
