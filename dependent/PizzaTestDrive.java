public class PizzaTestDrive {
 
	public static void main(String[] args) {
		// PizzaStore nyStore = new NYPizzaStore();

		DependentPizzaStore dependentPizzaStore = new DependentPizzaStore();
 
		Pizza pizza = dependentPizzaStore.createPizza("NY", "cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = dependentPizzaStore.createPizza("Chicago", "cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = dependentPizzaStore.createPizza("NY", "clam");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = dependentPizzaStore.createPizza("Chicago", "clam");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = dependentPizzaStore.createPizza("NY", "pepperoni");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = dependentPizzaStore.createPizza("Chicago", "pepperoni");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = dependentPizzaStore.createPizza("NY", "veggie");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = dependentPizzaStore.createPizza("Chicago", "veggie");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		// New Pizza store - Seoul
		System.out.println("=".repeat(50) + "\n");
		System.out.println("[The new pizza store in Seoul]");

		pizza = dependentPizzaStore.createPizza("Seoul", "cheese");
		System.out.println("Seorim ordered a " + pizza.getName() + "\n");

		pizza = dependentPizzaStore.createPizza("Seoul", "clam");
		System.out.println("Seorim ordered a " + pizza.getName() + "\n");

		pizza = dependentPizzaStore.createPizza("Seoul", "veggie");
		System.out.println("Seorim ordered a " + pizza.getName() + "\n");

		pizza = dependentPizzaStore.createPizza("Seoul", "kimchi");
		System.out.println("Seorim ordered a " + pizza.getName() + "\n");
		
	}
}
