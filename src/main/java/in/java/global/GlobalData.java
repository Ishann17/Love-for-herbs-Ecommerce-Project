package in.java.global;

import java.util.ArrayList;
import java.util.List;

import in.java.model.Product;

public class GlobalData {
	
	public static List<Product> cart;
	
	static {
		cart = new ArrayList<Product>();
	}
}
