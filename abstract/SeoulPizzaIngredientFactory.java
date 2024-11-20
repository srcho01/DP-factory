public class SeoulPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() { return new RiceCrustDough(); }

	public Sauce createSauce() {
		return new ClassicTomatoSauce();
	}
 
	public Cheese createCheese() {
		return new ParmesanCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = {
				new Garlic(), new Onion(), new Mushroom(), new RedPepper(),
				new BlackOlives(), new Eggplant(), new Spinach()
		};
		return veggies;
	}

	public Pepperoni createPepperoni() { return null; }

	public Clams createClam() {
		return new DomesticClams();
	}

	public Kimchi createKimchi() { return new ChoppedCabbageKimchi(); }

}
