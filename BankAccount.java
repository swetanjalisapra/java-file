public class BankAccount{
   double acntBal=10000;
    

   public double checkbal(){
       return acntBal;
   }
   public void deposit(double depositMoney){
    acntBal = acntBal + depositMoney;
   }

   public double withdraw(double withdrawalAmt){
       if(withdrawalAmt > acntBal)
       {
           System.out.println("you don't have enough balance");
           return 0.0;
       }
    acntBal = acntBal - withdrawalAmt;
    return withdrawalAmt;
}
}