package ru.tsymlyakov.spring;

public class BallBean {
    private String name;

    public BallBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
