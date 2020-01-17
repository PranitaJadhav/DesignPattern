package com.bridgelabz.visitordesignpattern;

public class ShoppingCartClient {

	public static void main(String[] args) {
		ItemElement[] item	=	new ItemElement[] {new Book(50,"123"),new Book(100, "234")};
		int total	=	calculatePrice(item);
		System.out.println("Total cost"+total);
		
	}
	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum=0;
		for(ItemElement item : items){
			sum = sum + item.accept(visitor);
		}
		return sum;
	}

}
