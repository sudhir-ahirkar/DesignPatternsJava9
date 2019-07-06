package com.sudhir.templateMethod;

public abstract class Network {
//private String userName;
//    private String password;

    protected String userName;
    protected String password;
    Network(){

    }

    abstract boolean  logIn(String userName,String pwd);
    abstract boolean sendData(byte data[]);
    abstract void logOut();

    public void postMessage(String mesage){
        if(logIn(this.userName,this.password)){
           if(sendData(mesage.getBytes())){
               logOut();
            }
        }
    }
}

class Twitter extends Network{

    Twitter(String userName, String pwd){
        this.userName=userName;
        this.password=pwd;
    }

    @Override
    boolean logIn(String userName, String pwd) {
        System.out.println("Checking the parameter for login");
        System.out.println("User Name: "+userName);
        System.out.println("Password: ");
        for (int i = 0; i < pwd.length(); i++) {
            System.out.print("*");
        }
        if((userName!=null && !userName.isEmpty()) &&( pwd!=null && !pwd.isEmpty())){
            System.out.println();
            System.out.println("User logged in successfully on Twitter");
            return true;
        }
        return true;
    }

    @Override
    boolean sendData(byte[] data) {
        boolean postMessage=true;
        if(postMessage){

            System.out.println(this.userName+" post "+ new String(data)+"message successfully");
            return true;
        }
        return false;
    }

    @Override
    void logOut() {
        System.out.println(this.userName+" logOut successfully on Twitter");
    }


}

class FaceBook extends Network{

    FaceBook(String userName, String pwd){
        this.userName=userName;
        this.password=pwd;
    }

    @Override
    boolean logIn(String userName, String pwd) {
        System.out.println("Checking the parameter for login");
        System.out.println("User Name: "+this.userName);
        System.out.println("Password: "+this.password);
        if((userName!=null && !userName.isEmpty()) &&( pwd!=null && !pwd.isEmpty())){
            System.out.println();
            System.out.println("User logged in successfully on Facebook");
            return true;
        }
        return true;
    }

    @Override
    boolean sendData(byte[] data) {
        boolean postMessage=true;
        if(postMessage){

            System.out.println(this.userName+" post "+ new String(data)+"message successfully");
            return true;
        }
        return false;
    }

    @Override
    void logOut() {
        System.out.println(this.userName+" logOut successfully on Facebook");
    }


}