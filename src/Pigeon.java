package com.company;

public class Pigeon extends Bird implements AnimalMove, AnimalBehavior{
    private String speciesShuma56633;

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }

    @Override
    public void moveShuma56633() {
        System.out.println("Pigeon is flying");
    }

    Pigeon(){
        super();
        speciesShuma56633="NN";
    }

    public Pigeon(String nameShuma56633, int ageShuma56633, int weightShuma56633, String featherColorShuma56633, String speciesShuma56633){
        super(nameShuma56633, ageShuma56633, weightShuma56633,featherColorShuma56633);
        this.speciesShuma56633= speciesShuma56633;
    }

    public Pigeon(int ageShuma56633, String featherColorShuma56633, String speciesShuma56633){
        super(ageShuma56633, featherColorShuma56633);
        this.speciesShuma56633=speciesShuma56633;
    }

    public void peckingWoodShuma56633(){
        System.out.println("The Pigeon is pecking wood");
    }

    @Override
    public void getVoiceShuma56633() {
        System.out.println("The Pigeon chirps");
    }

    @Override
    public void eatShuma56633(String FoodName) {
        System.out.println("The Pigeon is eating: "+ FoodName);
    }

    public String getSpeciesShuma56633() {
        return speciesShuma56633;
    }

    public void setSpeciesShuma56633(String speciesShuma56633) {
        this.speciesShuma56633 = speciesShuma56633;
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "speciesShuma56633='" + speciesShuma56633 + '\'' +
                '}';
    }
}
