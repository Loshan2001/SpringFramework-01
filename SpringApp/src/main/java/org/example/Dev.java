package org.example;

public class Dev {
    private int age;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    private Laptop laptop;
    public Dev(Laptop laptop){
        this.laptop = laptop;
    }
    public void build(){
        System.out.println("working on awesome project");
        laptop.compile();
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
