package modulo04.capitulo17.labs.entities;

import java.text.DecimalFormat;

public class Sale {

	private Integer month;
	private Integer year;
	private String seller;
	private Integer items;
	private Double total;

	public Sale(Integer month, Integer year, String seller, Integer items, Double total) {
		this.month = month;
		this.year = year;
		this.seller = seller;
		this.items = items;
		this.total = total;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public Integer getItems() {
		return items;
	}

	public void setItems(Integer items) {
		this.items = items;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double avaragePrice() {
		return total / items;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("##0.00");
		return month + "/" + year + ", " + seller + ", " + items + ", " + df.format(total) + ", pm = "
				+ df.format(avaragePrice());
	}

}
