package principles.solid.ocp.refactoring;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import principles.solid.ocp.OrderItem;

public class ItemPriceCalculator implements PriceCalculator {

	private List<PriceRule> priceRules;
	
	public ItemPriceCalculator() {
	this.priceRules = new ArrayList<>();
	this.priceRules.add(new EachItemRule());
	this.priceRules.add(new BOGORule());
	this.priceRules.add(new FiftyDiscountRule());
	this.priceRules.add(new SixtyDiscountRule());
	}
	
	@Override
	public double calculatePrice(OrderItem orderItem) {		
		Optional<PriceRule> rule = priceRules.stream().filter(priceRule->priceRule.isMatch(orderItem)).findFirst();
		return rule.isPresent()?rule.get().calculate(orderItem):0.0;
	}

}
