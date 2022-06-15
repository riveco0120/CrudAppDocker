package com.demoAppDocker.demoCrudAppDocker.domain;

public class Address {
    private String houseNumber;
    private String streeName;
    private String city;
    private String state;

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreeName() {
        return streeName;
    }

    public void setStreeName(String streeName) {
        this.streeName = streeName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
