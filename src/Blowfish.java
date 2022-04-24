
package com.company;

public class BlowFish extends Fish implements AnimalBehavior, AnimalMove{
    private int diameterShava56415;

    BlowFish(){
        super();
        diameterShava56415=10;
    }

    public BlowFish(String nameShava56415String , int ageShava56415 , int weightShava56415, String scaleColorShava56415, int diameterShava56415){
        super(nameShava56415String,ageShava56415,weightShava56415,scaleColorShava56415);
        this.diameterShava56415=diameterShava56415;

    }

    @Override
    public void moveShava56415() {
        System.out.println("Blowfish is swimming");
    }

    @Override
    public void sleep() {
        System.out.println("ZZZ");
    }

    public BlowFish(int ageShava56415, String scaleColorShava56415, int diameterShava56415){
        super(ageShava56415, scaleColorShava56415);
        this.diameterShava56415=diameterShava56415;
    }

    public void swimShava56415(){
        System.out.println("The BlowFish is swimming upstream");
    }

    @Override
    public void eatShava56415(String FoodName) {
        System.out.println("The BlowFish is eating: "+ FoodName);
    }

    @Override
    public void getVoiceShava56415() {
        System.out.println("The blowfish is howling");
    }

    public int getDiameterShava56415() {
        return diameterShava56415;
    }

    public void setDiameterShava56415(int diameterShava56415) {
        this.diameterShava56415 = diameterShava56415;
    }

    @Override
    public String toString() {
        return "BlowFish{" +
                "diameterShava56415=" + diameterShava56415 +
                '}';
    }
}
