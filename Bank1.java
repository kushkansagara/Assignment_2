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
import java.util.Scanner;
public class Bank1 {
    public static void main(String[] args) {
        System.out.println("An example for you to to create a proper account :");
        Account1 k2_2 =new Account1();
        k2_2.Accessor();
        Scanner sc = new Scanner(System.in);

        int id;
        double balance,withdraw,deposit,monintrate,monint;
        String date;
        System.out.println("Enter the Account number of your account  :");
        id = sc.nextInt();
        System.out.println("Enter the initial balance your account  :");
        balance = sc.nextDouble();
        System.out.println("Enter the date at which you created your account  :");
        date = sc.next();

        Account1 d2_2 = new Account1(id, balance, date);
        k2_2.Accessor();
        monintrate = k2_2.getMonthlyInterestRate();
        monint = k2_2.getMonthlyInterest();
        System.out.println("Bank give "+monintrate+"% monthly intrest rate.");
        System.out.println("Your monthly intrest is "+monint+" Rupees");
        int i;

        System.out.println("Enter 1 to withdraw and 2 to deposit.");
        i = sc.nextInt();
        switch(i)
        {
            case 1 :
            {
                System.out.println("Enter amount to be withdrawn  :");
                withdraw = sc.nextDouble();
                d2_2.withdraw(withdraw);
                System.out.println("The amount remained in your account after withdrawal is   :"+d2_2.balance);
                break;
            }
            case 2 :
            {
                System.out.println("Enter amount to be deposited  :");
                deposit = sc.nextDouble();
                balance = d2_2.deposit(deposit);
                System.out.println("The amount remained in your account after deposit is   :"+balance);
                break;
            }
            default :
            {
                System.out.println("You have changed anything  :");
                break;
            }
        }
        System.out.println("Your account afer withdrawal or deposit  :");
        d2_2.Accessor();

        int p=1;
        while(p==1)
        {
            System.out.println("Enter 1 use another account and 2 to not.");
            i = sc.nextInt();
            if(i==1)
            {
                System.out.println("Enter the Account number of your account  :");
                id = sc.nextInt();
                System.out.println("Enter the initial balance your account  :");
                balance = sc.nextDouble();
                System.out.println("Enter the date at which you created your account  :");
                date = sc.next();

                d2_2.mutator(id, balance, date);
                d2_2.Accessor();
                monintrate = d2_2.getMonthlyInterestRate();
                monint = d2_2.getMonthlyInterest();
                System.out.println("Bank give "+monintrate+"% monthly intrest rate.");
                System.out.println("Your monthly intrest is "+monint+" Rupees");
                System.out.println("Enter 1 to withdraw and 2 to deposit.");
                i = sc.nextInt();

                switch(i)
                {
                    case 1 :
                    {
                        System.out.println("Enter amount to be withdrawn  :");
                        withdraw = sc.nextDouble();
                        d2_2.withdraw(withdraw);
                        System.out.println("The amount remained in your account after withdrawal is   :"+d2_2.balance);
                        break;
                    }
                    case 2 :
                    {
                        System.out.println("Enter amount to be deposited  :");
                        deposit = sc.nextDouble();
                        balance = d2_2.deposit(deposit);
                        System.out.println("The amount remained in your account after deposit is   :"+balance);
                        break;
                    }
                    default :
                    {
                        System.out.println("You have changed anything  :");
                        break;
                    }
                }
            }
            else
            {
                System.out.println("--------------thanks for coming---------------------");
                break;
            }
        }
    }
}