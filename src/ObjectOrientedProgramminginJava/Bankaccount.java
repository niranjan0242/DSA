package ObjectOrientedProgramminginJava;

public class Bankaccount {
    private String Accountname;
    private double balance;

  //  public Bankaccount( String Accountname,double balance){
    //    this . Accountname=Accountname;
      //  this.balance=balance;
    //}

    public void setAccountname(String Accountname){
      this.Accountname=Accountname;
  }
  public void setBalance(double balance){
        this.balance=balance;

  }
    public String getAccountname(){
        return Accountname;
    }

    public double getBalance(){
        return balance;
    }

    public void deposite(double amount){
        if(amount > 0){
            balance += amount;
        } else {
            System.out.println("inavalid amount");
        }
    }
    public void withdraw(double amount){
        if(balance > amount){
            balance -= amount;

        } else {
            System.out.println("Insufficient amount");
        }
    }

    public static void main(String[] args) {
        Bankaccount b = new Bankaccount();
        b.setAccountname("niriri");
        b.setBalance(239944);
        System.out.println(b.getAccountname());
        System.out.println(b.getBalance());
    }
}
