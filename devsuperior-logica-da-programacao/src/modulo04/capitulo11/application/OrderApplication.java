package modulo04.capitulo11.application;

import java.util.Date;

import modulo04.capitulo11.entities.Order;
import modulo04.capitulo11.entities.enums.OrderStatus;

public class OrderApplication {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}
}
