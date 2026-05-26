public class Main {
    static void main() {
        Pizza p1 = new Pizza("non veg");
        p1.extraCheese();
        p1.extraTopping();
        p1.takeAway();
        //p1.getBill();

        DeluxPizza dp = new DeluxPizza("non veg");
        dp.takeAway();
        dp.getBill();


    }
}

