package org.example;

public class Dev {
    private Computer com;
    public Computer getCom() {
        return com;
    }
    public void setCom(Computer com) {
        this.com = com;
    }
    public Dev(Laptop laptop){

    }
    public void build(){
        System.out.println("working on awesome project");
    }

}
