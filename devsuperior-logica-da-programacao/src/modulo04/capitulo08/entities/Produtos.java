package modulo04.capitulo08.entities;

public class Produtos {

	private String item;
	private double priceBuy;
	private double priceSell;

	public Produtos(String item, double priceBuy, double priceSell) {
		this.item = item;
		this.priceBuy = priceBuy;
		this.priceSell = priceSell;
	}

	public Produtos() {
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getPriceBuy() {
		return priceBuy;
	}

	public void setPriceBuy(double priceBuy) {
		this.priceBuy = priceBuy;
	}

	public double getPriceSell() {
		return priceSell;
	}

	public void setPriceSell(double priceSell) {
		this.priceSell = priceSell;
	}

	public double totalPercentual(double priceBuy, double priceSell) {
		return (((priceSell * 100) / priceBuy) - 100);
	}
}
