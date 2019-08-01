package com.sudhir.facadeWithFactory;

import java.util.ArrayList;
import java.util.List;

public class NonVegMenues implements Hotel {
    @Override
    public Menu getMunues() {
        Menu menu=new Menu();
        List<String> menues=new ArrayList<>();
        menues.add("Non Veg Burger");
        menues.add("Non Veg Pizza");
        menues.add("Non Veg Thali");
        menu.setMenuAdded(menues);

        return menu;


    }


}
