package q3Interface;

public class Brownie implements BakedGoods {
	private int price;
	private String desc;
	private String sellByDate;
	
	public Brownie(int price, String desc, String sellByDate) {
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
		return "A moist, luscious brownie. " + desc;
	}

	@Override
	public String getSellByDate() {
		return sellByDate;
	}
}
