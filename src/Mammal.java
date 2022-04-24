package com.company;

public class Mammal extends AnimalMove.Animal implements AnimalMove,AnimalName {

    private String orderShuma56633;
    public Mammal(){
        super();
        orderShuma56633 = "NN";
    }

    @Override
    public void setAgeShuma56633(String FoodName) {

    }

    @Override
    public void setFeatherColorShuma56633(String FoodName) {

    }

    @Override
    public void sleep() {

    }

    public Mammal(String nameShuma56633, int ageShuma56633 , int weightShuma56633, String orderShuma56633){
        super(nameShuma56633, ageShuma56633, weightShuma56633);
        this.orderShuma56633=orderShuma56633;
    }

    public Mammal(int ageShuma56633 , String orderShuma56633){
        super(ageShuma56633);
        this.orderShuma56633=orderShuma56633;
    }

    @Override
public void moveShuma56633() {
        System.out.println("Mammal is moving ");
        }

public void drinkMilkShuma56633(){
        System.out.println("Gulp gulp");
        }


@Override
public void getVoiceShuma56633() {
        System.out.println("Mammal is making sounds");
        }

@Override
public void eatShuma56633(String FoodName) {
        System.out.println("Mammal is eating: " + FoodName);
        }

public String getOrderShuma56633() {
        return orderShuma56633;
        }

public void setOrderShuma56633(String orderShuma56633) {
        this.orderShuma56633 = orderShuma56633;
        }

@Override
public String toString() {
        return "Mammal{" +
        "orderShuma56633='" + orderShuma56633 + '\'' +
        '}';
        }
        }