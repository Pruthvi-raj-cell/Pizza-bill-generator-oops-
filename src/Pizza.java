public class Pizza {

   private String inputPizzaType;
   private int basPrice;
   final private int extraCheesePrice = 100;
   final private int extraToppingsPrice = 100;
   final private int takeAwayPrice = 20;
   private boolean extraCheeseAdded = false;
   private boolean extraToppingsAdded = false;
   private boolean opForTakeAway = false;

   public Pizza(String inputPizzaType){

        this.inputPizzaType = inputPizzaType;

              if(this.inputPizzaType.equals("veg")){
                   this.basPrice= 300;
             }else{
                  this.basPrice = 400;
       }
   }


   public void extraCheese(){
       extraCheeseAdded = true;

       this.basPrice += extraCheesePrice;
   }

   public void extraTopping(){
       extraToppingsAdded = true;

       this.basPrice += extraToppingsPrice;

   }

   public void takeAway(){
       opForTakeAway = true;
         this.basPrice += takeAwayPrice;
   }

   public void getBill(){

       String bill = "";

       if(extraCheeseAdded){
           bill += "extra cheese added :"+extraCheesePrice+"/n";
       }
       if(extraToppingsAdded){
           bill += "extra toppings added :"+extraToppingsAdded+"/n";
       }
       if(opForTakeAway){
           bill += "op for take away :"+takeAwayPrice+"/n";
       }

   }


}
