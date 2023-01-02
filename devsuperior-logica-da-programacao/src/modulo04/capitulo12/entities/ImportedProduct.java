package modulo04.capitulo12.entities;

import java.text.DecimalFormat;

public class ImportedProduct extends Product {

	private Double customsFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	public Double totalPrice() {
		return getPrice() + customsFee;
	}

	@Override
	public String priceTag() {
		DecimalFormat df = new DecimalFormat("##0.00");
		StringBuilder sb = new StringBuilder();

		sb.append(getName());
		sb.append(" $ " + df.format(totalPrice()));
		sb.append(" (Customs fee: $ " + df.format(getCustomsFee()) + ")");
		return sb.toString();
	}
}
