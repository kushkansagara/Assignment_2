/*
Name : Kansagara Kush H. ID	: 21ce051.
Aim : Design a class named Account that contains:
•A private int data field namedid for the account (default 0).
•A private double data field named balance for the account (default
500₹).
•	A private double data field named annualInterestRate that stores the currentinterest rate (default 7%).
•A private Date data field named dateCreated that stores
the date when theaccount was created.
•A no-arg constructor that creates a default account.
•A constructor that creates an account with the specified id and
initial balance.
•The accessor and mutator methods for id, balance, and
annualInterestRate.
•The accessor method for dateCreated.
•A method named getMonthlyInterestRate() that returns the
monthlyinterest rate.
•A method named getMonthlyInterest() that returns the monthly
interest.
•A method named withdraw that withdraws a specified amount from
theaccount.
•A method named deposit that deposits aspecified amount to the
account.
*/

public class Account1 {
    static public int id;
    static public double balance;
    final static private double annualInterestRate = 7;
    static public String dateCreated;
    public Account1() {
        id = 0;
        balance = 500;
        dateCreated = "06/11/2003";
    }
    public Account1(int Ac, double bal, String d) {
        id = Ac;
        balance = bal;
        dateCreated = d;
    }
    public void Accessor() {
        System.out.println("Your Account  :" + id);
        System.out.println("Total balance in your account is  :" + balance + " Rupees");
        System.out.println("The intrest given by the bank is  :" + annualInterestRate);
        System.out.println("The at which your account was created is  :" + dateCreated);
    }
    public void mutator(int ac, double bal, String d) {
        id = ac;
        balance = bal;
        dateCreated = d;
    }
    public double getMonthlyInterestRate()
    {
        return annualInterestRate / 12;
    }
    public double getMonthlyInterest()
    {
        return (annualInterestRate / 12) * balance / 100;
    }
    public void withdraw(double draw)
    {
        balance =  balance - draw;
    }
    public double deposit(double dep)
    {
        return balance + dep;
    }
    public String toString() {
        String res = "";
        res += "Account number : " + id + "\n";
        res += "Balance in account is : " + balance + "\n";
        res += "Annual Interest Rate given by bank is : " + annualInterestRate + "\n";
        res += "Date of creation of account is : " + dateCreated + "\n";
        return res;
    }
}