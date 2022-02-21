package com.digital_nomads.javaFall2021.applications;

public class KyrgyzstanBank extends BankBase{
    private double balance = 0;
    private String phoneNumber = "";

    public void transferWithPhoneNumber( String phoneNumber){
        if(phoneNumber.length() != 13 || !phoneNumber.startsWith("+")){
            System.err.println("Invalid phone number");
        }else {

            System.out.println("Success");
        }

    }

    public KyrgyzstanBank(long accountNumber, long routingNumber) throws Exception{
        super(accountNumber,routingNumber);
    }
    public KyrgyzstanBank( String phoneNumber) throws Exception {


        this.phoneNumber = phoneNumber;

    }

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public void deposit(double amount) throws Exception {

    }

    @Override
    public void withDraw(double amount) throws Exception {

    }
}
