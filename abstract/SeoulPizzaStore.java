public class SeoulPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new SeoulPizzaIngredientFactory();

        switch (item) {
            case "cheese" -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Seoul Style Cheese Pizza");
            }
            case "veggie" -> {
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Seoul Style Veggie Pizza");
            }
            case "clam" -> {
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Seoul Style Clam Pizza");
            }
            case "kimchi" -> {
                pizza = new KimchiPizza(ingredientFactory);
                pizza.setName("Seoul Style Kimchi Pizza");
            }
        }

		return pizza;
	}
}
