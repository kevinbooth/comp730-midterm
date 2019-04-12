package q3Interface;

public class Cookie implements BakedGoods {
	private int price;
	private String desc;
	private String sellByDate;
	
	public Cookie(int price, String desc, String sellByDate) {
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
		return "A delicious cookie. " + desc;
	}

	@Override
	public String getSellByDate() {
		return sellByDate;
	}
}
