package com.udacity.cart;

import com.udacity.cart.model.CartItem;
import com.udacity.cart.model.CartTotals;
import com.udacity.cart.service.TotalsCalculator;

import java.util.List;
import java.util.stream.Collector;
import org.junit.jupiter.api.Test;

public class TotalsCalculatorTest {

	@Test
	public void testTotals() {
		CartItem1 = new CartItem("Eggs", 1.5, 0.05);
		CartItem2 = new CartItem("Bacon", 2.5, 0.05);
		List<CartItem> CartItems = new ArrayList<CartItem>;
		CartItems.add(CartItem1);
		CartItems.add(CartItem2);
		expectedCartTotals = new CartTotals(4.0, 0.1);
		assertEquals(expectedCartTotals, getTotals(CartItems),"Expected to see 4.0 and 0.1");
	}
}
