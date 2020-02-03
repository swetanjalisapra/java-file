import java.util.Scanner;
public class Client{
    public static void main(String[] args) {
        
    
    BankAccount bk=new BankAccount();
    Scanner sc=new Scanner(System.in);
    double dep=sc.nextDouble();
    System.out.println("your balance is:"+bk.checkbal());
    bk.deposit(dep);
    double with=sc.nextDouble();
    double money = bk.withdraw(with);
    if(money != 0.0){
        System.out.println("your have withdrawn:"+ money);
    }
   
    System.out.println("your updated balance is:"+bk.checkbal());
}
}