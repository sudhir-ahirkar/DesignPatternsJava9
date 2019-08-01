package com.sudhir.facadeWithFactory;

public class HotelKeeper {

 private  String typeOfDish;
    public HotelKeeper(String typeOfDish){

        this.typeOfDish=typeOfDish;
    }

    public HotelKeeper(){

    }


   public void getTypeOfDish(Integer typeOfDish){

        MenusFactory menusFac=new MenusFactory();
        Hotel h=menusFac.getMenusAsPerRequirement(typeOfDish);

        Menu menu=h.getMunues();
       System.out.println(menu);

    }



}
