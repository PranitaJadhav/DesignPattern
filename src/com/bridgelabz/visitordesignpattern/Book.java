package com.bridgelabz.visitordesignpattern;

public class Book implements ItemElement {
	private int price;
	private String isbnNumber;
	public Book(int cost,String isbnnum) {
		this.price		=	cost;
		this.isbnNumber	=	isbnnum;
	}
	public int getPrice() {
		return price;
	}
	
	public String getIsbnNumber() {
		return isbnNumber;
	}
	
	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
