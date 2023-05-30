package ATM_new;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    Scanner input=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");





//    Set the customer number

    public int setCustomerNumber(int customerNumber){
        this.customerNumber=customerNumber;
        return customerNumber;
    }
//  Get the customer number
    public int getCustomerNumber() {
        return customerNumber;
    }
    //    Set the pin number
    public int setPinNumber(int pinNumber){
        this.pinNumber=pinNumber;
        return pinNumber;
    }
    //    get the pin number
    public int getPinNumber() {
        return pinNumber;
    }
    //    get the checking Account BaLance
    public double getCheckingBalance(){

        return checkingBalance;
    }
    //    get the saving Account BaLance

    public double getSavingBalance(){

        return savingBalance;
    }                    

//    Calculate checking account withdrawal

    public double calcCheckingWithdraw(double amount){
        checkingBalance=(checkingBalance-amount);
        return checkingBalance;
    }

    //    Calculate saving account withdrawal
    public double calcSavingWithdraw(double amount){
        savingBalance=(savingBalance-amount);
        return savingBalance;
    }

    public double calCheckingDeposit(double amount){
        checkingBalance=(checkingBalance+amount);
        return checkingBalance;
    }

    public double calcSavingDeposit(double amount){
        savingBalance=savingBalance+amount;
        return savingBalance;
    }
    

//customer checking account withdrawal input
    public void getCheckingWithdrawInput(){
        System.out.println("checking amount balance: "+ moneyFormat.format(checkingBalance));
        System.out.println("amount you want to withdraw from checking account:");
        double amount =input.nextDouble();

        if((checkingBalance-amount)>=0){
            calcCheckingWithdraw(amount);
            System.out.println("new checking amount balance: "+moneyFormat.format(checkingBalance));

        }
        else {
            System.out.println("balance cannot be negative.\n");
        }
    }

//    customer saving account withdrawal input

    public void getSavingWithdrawInput(){
        System.out.println("checking amount balance: "+ moneyFormat.format(savingBalance));
        System.out.println("amount you want to withdraw from Saving account:");
        double amount =input.nextDouble();

        if((savingBalance-amount)>=0){
            calcSavingWithdraw(amount);
            System.out.println("new checking amount balance: "+savingBalance+"\n");


        }
        else {
            System.out.println("balance cannot be negative.\n");
        }
    }

//customer checking account deposit input
    public void getCheckingDepositInput(){
        System.out.println("checking amount balance: "+ moneyFormat.format(checkingBalance));
        System.out.println("amount you want to deposit from Saving account:");
        double amount =input.nextDouble();

        if((checkingBalance+amount)>=0){
            calCheckingDeposit(amount);
            System.out.println("new checking amount balance: "+moneyFormat.format(checkingBalance));

        }
        else {
            System.out.println("balance cannot be negative.\n");
        }
    }

//customer saving account deposit input
    public void getSavingDepositInput(){
        System.out.println("saving amount balance: "+ moneyFormat.format(savingBalance));
        System.out.println("amount you want to deposit from Saving account:");
        double amount =input.nextDouble();

        if((savingBalance+amount)>=0){
            calcSavingDeposit(amount);
            System.out.println("new saving amount balance: "+moneyFormat.format(savingBalance)+"\n");


        }
        else {
            System.out.println("balance cannot be negative.\n");
        }
    }

    private int customerNumber;
    private int pinNumber;

    private double checkingBalance=0;

    private double savingBalance=0;
}
