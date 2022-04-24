package com.company;

public class Dog extends com.company.Mammal implements AnimalBehavior,AnimalMove{
    private String breedShuma56633;

    Dog(){
        super();
        breedShuma56633= "NN";
    }

    public Dog(String nameShuma56633 , int ageShuma56633,int weightShuma56633,String rzadShuma56633, String breedShuma56633){
        super(nameShuma56633,ageShuma56633,weightShuma56633,rzadShuma56633);
        this.breedShuma56633= breedShuma56633;
    }
public Dog(int ageShuma56633, String rzadShuma56633, String breedShuma56633){
        super(ageShuma56633,rzadShuma56633);
        this.breedShuma56633 =breedShuma56633;
        }

public void sportShuma56633(){
        System.out.println("The dog is retrieving.");
        }

@Override
public void drinkMilkShuma56633() {
        System.out.println("The dog is drinking milk.");
        }

@Override
public void getVoiceShuma56633() {
        System.out.println("The dog is barking.");
        }

@Override
public void eatShuma56633(String FoodName) {
        System.out.println("The dog is eating: "+ FoodName);
        }

@Override
public void sleep() {
        System.out.println("ZZZ");
        }

@Override
public void moveShuma56633() {
        System.out.println("Dog is running");
        }

public String getBreedShuma56633() {
        return getBreedShuma56633();
        }

public void setBreedShuma56633(String breedShuma56633) {
        this.getBreedShuma56633() = breedShuma56633;
        }

@Override
public String toString() {
        return "Dog{" +
        "breedShuma56633='" + getBreedShuma56633() + '\'' +
        '}';
        } }

