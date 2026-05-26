public class Pizza {

   private String inputPizzaType;
   private int basPrice;
   final private int extraCheesePrice = 100;
   final private int extraToppingsPrice = 100;
   final private int takeAwayPrice = 20;

   public Pizza(String inputPizzaType){

        this.inputPizzaType = inputPizzaType;

              if(this.inputPizzaType.equals("veg")){
                   this.basPrice= 300;
             }else{
                  this.basPrice = 400;
       }
   }
   public void getPizzaPrice(){
       System.out.println(this.basPrice);
   }

   public void extraCheese(){
       System.out.println("extra cheese has been added");
       this.basPrice += extraCheesePrice;
   }

   public void extraTopping(){
       System.out.println("extra toppings has been added");
       this.basPrice += extraToppingsPrice;

   }

   public void takeAway(){
    this.basPrice += takeAwayPrice;
   }

   public void getBill(){
       System.out.println(this.basPrice);
   }


}
