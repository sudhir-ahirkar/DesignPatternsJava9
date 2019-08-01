package com.sudhir.facadeWithFactory;

import java.util.ArrayList;
import java.util.List;

public class VegMenues implements Hotel {
    @Override
    public Menu getMunues() {
        Menu menu=new Menu();
        List<String> menues=new ArrayList<>();
        menues.add("Veg Burger");
        menues.add("Veg Pizza");
        menues.add("Veg Thali");
        menu.setMenuAdded(menues);

        return menu;

    }
}
