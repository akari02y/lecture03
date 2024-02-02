package org.example;

public class Customer {
    private String name;
    private int id;
    private int old;
    private String sex;

    public Customer(String name, int id, int old, String sex) {
        this.name = name;
        this.id = id;
        this.old = old;
        this.sex = sex;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public int getOld() {
        return this.old;
    }

    public String getSex() {
        return this.sex;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String matome() {
        return this.name + "様(" + this.sex + ")" + "のIDは" + this.id + "で、年齢は" + this.old + "です。";

    }
}

