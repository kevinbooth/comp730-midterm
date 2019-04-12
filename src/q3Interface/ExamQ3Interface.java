package q3Interface;

import java.util.ArrayList;
import java.util.List;

public class ExamQ3Interface {

	public static void main(String[] args) {
		List<BakedGoods> bakedGoods = new ArrayList<BakedGoods>();
		
		bakedGoods.add(new Cookie(3, "This contains nuts.", "4/26/2019"));
		bakedGoods.add(new CinnamonRoll(5, "Warm this up for 30 seconds in the microwave.", "4/19/2019"));
		bakedGoods.add(new Brownie(3, "This has double chocolate!", "4/14/2019"));
		
		for (BakedGoods bg : bakedGoods) {
			System.out.println("Price: " + bg.getPrice());
			System.out.println("Description: " + bg.getDescription());
			System.out.println("Sell-by Date: " + bg.getSellByDate() + "\n");
		}
	}

}
