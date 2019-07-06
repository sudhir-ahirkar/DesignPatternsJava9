package com.sudhir.templateMethod;

import java.util.Scanner;

public class NetworkDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to Template method design pattern on Network domain");
        Network network=null;
        Scanner scanner=new Scanner(System.in);
        int reatedOperation=1;
        while (reatedOperation==1){
            System.out.println("Please provide user name :");
            String userName= scanner.next();
            System.out.println("Please provide password :");
            String password= scanner.next();
            System.out.println("Choose socaial network to post message:\n"+
            "1- FaceBook \n"+
            "2- Twitter");
            Integer newtworkOption=scanner.nextInt();
            switch (newtworkOption){
                case 1:
                    network=new FaceBook(userName,password);
                    break;
                case 2:
                    network=new Twitter(userName,password);
                    break;
                default:
                    System.out.println("Please provide the valid data");
            }
            System.out.println("Please provide the message to post on network side");
            String message=scanner.nextLine();
            network.postMessage(message);
            System.out.println("Press 1 to make more Juices ;-) and 0 for EXIT .... ");
            reatedOperation=scanner.nextInt();
        }
        System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Sudhir Ahirkar $$$$$$$$$$$$$$$$$$$$$$ \n ");
    }
}
