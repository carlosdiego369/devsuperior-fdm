package modulo04.capitulo12.entities;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	private Date manufactureDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("##0.00");
		StringBuilder sb = new StringBuilder();

		sb.append(getName() + " (used)");
		sb.append(" $ " + df.format(getPrice()));
		sb.append(" (Manufacture date: " + sdf.format(getManufactureDate()) + ")");
		return sb.toString();
	}
}
