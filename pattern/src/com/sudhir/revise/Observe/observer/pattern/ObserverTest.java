package com.sudhir.revise.Observe.observer.pattern;

public class ObserverTest {
    public static void main(String[] args) {
        PrintMedia printMedia=new PrintMedia();
        OnlineMedia onlineMedia=new OnlineMedia();
        Loan loan=new Loan("Personal Loan",2.5f,"HDFC bank");
        loan.registeredObserver(printMedia);
        loan.registeredObserver(onlineMedia);
        loan.setInterestRate(1.2f);
    }
}
