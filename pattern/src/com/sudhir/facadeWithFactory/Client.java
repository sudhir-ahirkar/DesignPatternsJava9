package com.sudhir.facadeWithFactory;

import java.util.Scanner;

public class Client {

    public  static void  main(String s[]){

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 1 for Veg , 2 for NonVeg");
        Integer tyepOfDish=input.nextInt();
        HotelKeeper hotelKeeper=new HotelKeeper();
//        hotelKeeper.getTypeOfDish(tyepOfDish);
        System.out.println("Please enter 0 for exit or reOrder 1 or 2");
        tyepOfDish=input.nextInt();
        if(tyepOfDish!=0){
            hotelKeeper.getTypeOfDish(tyepOfDish);
        }

        System.out.println("We are pleased to serve you !!");
    }
}
