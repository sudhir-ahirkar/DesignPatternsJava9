package com.sudhir.revise.Observe.observer.pattern;

public class PrintMedia implements Observer {

    @Override
    public void upate(float interest) {
        //System.out.println("Interest rate modify by "+interest);
        System.out.println("Newspaper: Interest Rate updated, new Rate is: "
                + interest);
    }
}
