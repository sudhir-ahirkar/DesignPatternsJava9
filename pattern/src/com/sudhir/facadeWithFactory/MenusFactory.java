package com.sudhir.facadeWithFactory;

public class MenusFactory {
    private String menuType;

    public MenusFactory(String menuType) {
        this.menuType = menuType;
    }
    public MenusFactory(){

    }


    public Hotel
    getMenusAsPerRequirement(Integer menuType) {

        Hotel typeOfHotel=null;
        switch(menuType) {
            case 1:
                typeOfHotel=  new VegMenues();
                break;
            case 2:
                typeOfHotel=  new NonVegMenues();
                break;
                default:
                    typeOfHotel=null;
        }


        return typeOfHotel;
    }

}