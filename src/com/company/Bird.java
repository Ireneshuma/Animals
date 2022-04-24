package com.company;

abstract class Bird extends AnimalMove.Animal implements AnimalMove,AnimalBehavior{
    private String featherColorShuma56633;



    @Override
    public void sleep() {
        System.out.println("Zzz");
    }

    public Bird(){
        super();
        featherColorShuma56633="NN";


    }

    public Bird (String nameShuma56633, int ageShuma56633, int weightShuma56633, String featherColorShuma56633){
        super(nameShuma56633, ageShuma56633, weightShuma56633);
        this.featherColorShuma56633=featherColorShuma56633;
    }

    public Bird(int ageShuma56633 , String featherColorShuma56633){
        super(ageShuma56633);
        this.featherColorShuma56633=featherColorShuma56633;
    }

    public void takingFlightShuma56633(){
        System.out.println("Flap flap");
    }



    @Override
    public void getVoiceShuma56633() {
        System.out.println("Bird is making sounds");
    }

    @Override
    public void setFeatherColorShuma56633(String FoodName) {
        System.out.println("Bird is eating: " + FoodName);
    }

    public String getFeatherColorShuma56633() {
        return featherColorShuma56633;
    }






    @Override
    public String toString() {
        return "Bird{" +
                "featherColorShuma56633='" + featherColorShuma56633 + '\'' +
                '}';
    }
}
