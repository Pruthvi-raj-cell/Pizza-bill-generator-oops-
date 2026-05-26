public class Pizza {

   private String inputPizzaType;
   private int basPrice;

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

}
