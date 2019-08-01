package com.sudhir.facadeWithFactory;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    List<String> menuAdded=new ArrayList<>();

    public List<String> getMenuAdded() {
        return menuAdded;
    }

    public void setMenuAdded(List<String> menuAdded) {
        this.menuAdded = menuAdded;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuAdded=" + menuAdded +
                '}';
    }
}
