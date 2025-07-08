package com.designpatterns.facadedesignpattern.nofacade;

import com.designpatterns.facadedesignpattern.services.EmailService;
import com.designpatterns.facadedesignpattern.services.InventoryService;
import com.designpatterns.facadedesignpattern.services.OrderService;
import com.designpatterns.facadedesignpattern.services.PaymentService;
import com.designpatterns.facadedesignpattern.services.ShippingService;

public class Main {
	public static void main(String[] args) {
		InventoryService inventory = new InventoryService();
		PaymentService payment = new PaymentService();
	    OrderService order = new OrderService();
	    ShippingService shipping = new ShippingService();
	    EmailService email = new EmailService();
	    
	    String itemId = "ITEM123";
        String user = "A";
        String card = "VISA-1234";
	    
	    System.out.println("Placing the Order");
	    inventory.checkStock(itemId);
        payment.validate(card);
        payment.charge(card, 999.99);
        order.createOrder(itemId, user);
        shipping.scheduleDelivery(itemId);
        email.sendConfirmation(user);
	}
}



