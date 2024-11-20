public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
 
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("clam");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("clam");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("veggie");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		// The new store - Seoul
		System.out.println("=".repeat(50) + "\n");
		System.out.println("[The New Pizza Store in Seoul]");

		PizzaStore seoulStore = new SeoulPizzaStore();

		pizza = seoulStore.orderPizza("cheese");
		System.out.println("Seorim ordered a " + pizza.getName() + "\n");

		pizza = seoulStore.orderPizza("clam");
		System.out.println("Seorim ordered a " + pizza.getName() + "\n");

		pizza = seoulStore.orderPizza("veggie");
		System.out.println("Seorim ordered a " + pizza.getName() + "\n");

		pizza = seoulStore.orderPizza("kimchi");
		System.out.println("Seorim ordered a " + pizza.getName() + "\n");

	}
}
