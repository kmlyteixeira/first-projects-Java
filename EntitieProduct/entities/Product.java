package entities;

public class Product {
   public String name;
   public double price;
   public int quantity;

   public double totalValueInStock(){
       return price * quantity;
   }

   public void addProducts(int quatity){
        this.quantity += quantity;
   }

   public void removeProducts (int quantity){
       this.quantity -= quantity;
   }
}
