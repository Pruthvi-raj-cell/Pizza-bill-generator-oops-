public class DeluxPizza extends Pizza{
// when u choose delux pizza you cant add extra cheese or toppings it gets automatically added when you op
    //for a delux pizza

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
