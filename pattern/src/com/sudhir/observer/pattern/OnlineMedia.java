package com.sudhir.observer.pattern;

public class OnlineMedia implements Observer {
        @Override
        public void upate(float interest) {

            //System.out.println("Interest rate modify by "+interest);

            System.out.println("Internet: Interest Rate updated, new Rate is: "
                    + interest);


      //      Read more: https://javarevisited.blogspot.com/2011/12/observer-design-pattern-java-example.html#ixzz5svw9jvHO


        }
}
