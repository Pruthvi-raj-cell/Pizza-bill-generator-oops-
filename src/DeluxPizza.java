public class DeluxPizza extends Pizza{

    public DeluxPizza(String inputPizzaType) {
        super(inputPizzaType);
        super.extraCheese();
        super.extraTopping();

    }

    @Override
    public void extraCheese() {

    }

    @Override
    public void extraTopping() {
    }
}
