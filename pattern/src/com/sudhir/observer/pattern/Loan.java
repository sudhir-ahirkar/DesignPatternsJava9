package com.sudhir.observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class Loan implements Subject {

    List<Observer> observerList=new ArrayList<>();
    private String loanType;
    private Float interestRate;
    private String bank;

    public Loan(String loanType, Float interestRate, String bank) {
        this.loanType = loanType;
        this.interestRate = interestRate;
        this.bank = bank;
    }

    @Override
    public void registeredObserver(Observer observer) {
      observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObserver() {
         observerList.stream().forEach(observer->{
             System.out.println("Notifying Observers on change in Loan interest rate");
             observer.upate(this.interestRate);
         });
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public Float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Float interestRate) {
        this.interestRate = interestRate;
        notifyObserver();
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }
}
