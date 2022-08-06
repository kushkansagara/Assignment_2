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
import java.util.Scanner;
public class MyAccount {
    public static void main(String[] args) {
        Account1 account = new Account1(111, 200,"06-08-2022");
        System.out.println("simple account");
        System.out.println(account);
        System.out.println("--------------------------------------------------------------------------------------");
        CheckingAccount checkingAccount = new CheckingAccount(112, 250,"05-08-2022");
        System.out.println("Checking account");
        System.out.println(account);
        System.out.println("Enter ammount for withdrawing in checking account  :");
        Scanner s = new Scanner(System.in);
        double ammount = s.nextDouble();
        checkingAccount.withdraw(ammount);
        System.out.println(checkingAccount);
        SavingsAccount savingsAccount = new SavingsAccount(113, 10000,"05-08-2022");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Saving account");
        System.out.println(account);
        System.out.println("Enter ammount for withdrawing in saving account  :");
        double ammounts = s.nextDouble();
        savingsAccount.withdraw(ammounts);
        System.out.println(savingsAccount);
    }
}
