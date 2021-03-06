/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
   private double purchase;
   private double payment;
   private double numberofpurchases;
   private double allsales;
   private double dollars;
   private double quarters;
   private double nickels;
   private double dimes;
   private double pennies;

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      purchase = 0;
      payment = 0;
      numberofpurchases = 0;
      allsales = 0;
      dollars = 0;
      quarters = 0;
      nickels = 0;
   }

   /**
      Records the sale of an item.
      @param amount the price of the item
   */
   public void recordPurchase(double amount)
   {
      double total = purchase + amount;
      allsales = total;
      purchase = total;
      numberofpurchases = numberofpurchases + 1;
   }

   /**
      Enters the payment received from the customer.
      @param amount the amount of the payment
   */
   public void enterPayment(double amount)
   {
      payment = amount;
   }
  
   public void enterDollars(double amount)
   {
      dollars = amount*100;
   }
   
   public void enterQuarters(double amount)
   {
      quarters = amount*25;
   }
   public void enterDimes(double amount)
   {
      dimes = amount*10;
   }
   
   public void enterNickels(double amount)
   {
      nickels = amount*5;
   }
   public void enterPennies(double amount)
   {
      pennies = amount;
   }
   
   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {  
      payment = dollars + quarters + dimes + nickels + pennies; 
      double change = payment/100 - purchase;
      purchase = 0;
      payment = 0;
      return change;
   }
   public double getItemCount()
   {
       double num = numberofpurchases;
       numberofpurchases = 0;
       return num;
   }    
   
   public double giveTotalSales()
   {
       double totes = allsales;
       return totes;
   }    
}