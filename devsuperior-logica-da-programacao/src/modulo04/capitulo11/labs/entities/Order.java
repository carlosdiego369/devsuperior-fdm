package modulo04.capitulo11.labs.entities;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import modulo04.capitulo11.labs.entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;
	private Client client;

	List<OrderItem> orderItems = new ArrayList<>();

	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

//	public void setOrderItems(List<OrderItem> orderItems) {
//		this.orderItems = orderItems;
//	}

	public void addItem(OrderItem item) {
		orderItems.add(item);
	}

	public void removeItem(OrderItem item) {
		orderItems.remove(item);
	}

	public double total() {
		double sum = 0;

		for (OrderItem o : orderItems) {
			sum += o.subTotal();
		}

		return sum;

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		DecimalFormat df = new DecimalFormat("##0.00");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: " + sdf.format(getMoment()));
		sb.append("\nOrder status: " + getStatus());
		sb.append("\nClient: " + client);
		sb.append("\nOrder items:\n");
		for (OrderItem o : orderItems) {
			sb.append(o.toString() + "\n");
		}
		sb.append("Total price: $" + df.format(total()));

		return sb.toString();
	}
}
