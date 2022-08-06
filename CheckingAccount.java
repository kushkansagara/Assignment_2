/*
Name : Kansagarav Kush H. ID: 21ce051.
Aim : (Subclasses of Account) In Programming Exercise 2, the Account class  was
defined to model a bank account. An account has the properties account number,
balance, annual interestrate, and date created, and methods to deposit
and withdrawfunds. Create two subclasses for checking and saving accounts.
A checkingaccount has an overdraft limit, but a savings account cannot be overdrawn.Draw
the UML diagram for the classes and then implement them.
Writea test program that creates
objects of Account, SavingsAccount, and CheckingAccount and invokes their toString() methods.
*/


class CheckingAccount extends Account1 {
    protected double OVERDRAFT_LIMIT = -100;
    public CheckingAccount(int id, double balance,String date) {
        super(id, balance,date);
    }
    public void withdraw(double amount) {
        if (balance - amount >= OVERDRAFT_LIMIT) {
            super.withdraw(amount);
        }
        else
            System.out.println("Over drawing is passing the given limit  : ");
    }


    public String toString() {
        return "CheckingAccount{"+ "mBalance=" + balance +'}';
    }
}
class SavingsAccount extends Account1 {
    protected double OVERDRAFT_LIMIT = 0;
    public SavingsAccount(int id, double balance,String date) {
        super(id, balance, date);
    }
    public void withdraw(double amount) {
        if (balance - amount >= OVERDRAFT_LIMIT || balance - amount <= OVERDRAFT_LIMIT)
            super.withdraw(amount);
    }
    public String toString() {
        return "SavingsAccount{" + "net Balance =" + balance +'}';
    }
}
