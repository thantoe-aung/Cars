package com.example.cars.Pojos;

import android.content.Context;

public class Car {

    private String name;
    private String price;
    private String type;
    private String numOfPeople;
    private String numOfCard;
    private String numOfWindow;
    private String carImage;
    private String pickupDate;
    private String dropOffDate;
    private String condition;


    public Car(String name, String price, String type, String numOfPeople, String numOfCard, String numOfWindow, String carImage, String pickupDate, String dropOffDate, String condition) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.numOfPeople = numOfPeople;
        this.numOfCard = numOfCard;
        this.numOfWindow = numOfWindow;
        this.carImage = carImage;
        this.pickupDate = pickupDate;
        this.dropOffDate = dropOffDate;
        this.condition = condition;
    }

    public int getImageResource(Context context){
        return context.getResources().getIdentifier(this.carImage,"drawable",context.getPackageName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(String numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    public String getNumOfCard() {
        return numOfCard;
    }

    public void setNumOfCard(String numOfCard) {
        this.numOfCard = numOfCard;
    }

    public String getNumOfWindow() {
        return numOfWindow;
    }

    public void setNumOfWindow(String numOfWindow) {
        this.numOfWindow = numOfWindow;
    }

    public String getCarImage() {
        return carImage;
    }

    public void setCarImage(String carImage) {
        this.carImage = carImage;
    }

    public String getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getDropOffDate() {
        return dropOffDate;
    }

    public void setDropOffDate(String dropOffDate) {
        this.dropOffDate = dropOffDate;
    }


    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
