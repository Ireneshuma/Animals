import com.company.AnimalBehavior;
import com.company.AnimalMove;

abstract class Fish extends AnimalMove.Animal implements AnimalBehavior,AnimalMove{
    private String scaleColorShuma56633;

    public Fish(){
        super();
        scaleColorShuma56633= "NN";
    }

    public Fish(String nameShuma56633, int ageShuma56633 , int weightShuma56633, String scaleColorShuma56633){
        super(nameShuma56633, ageShuma56633, weightShuma56633);
        this.scaleColorShuma56633= scaleColorShuma56633;
    }

    public Fish(int ageShuma56633 , String scaleColorShuma56633){
        super(ageShuma56633);
        this.scaleColorShuma56633=scaleColorShuma56633;
    }

    public void drinkWaterShuma56633(){
        System.out.println("Gulp gulp");
    }

    @Override
    public void getVoiceShuma56633() {
        System.out.println("Fish is making sounds");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }

    @Override
    public void eatShuma56633(String FoodName) {
        System.out.println("Fish is eating: "+ FoodName);
    }

    public String getScaleColorShuma56633() {
        return scaleColorShuma56633;
    }

    public void setScaleColorShuma56633(String scaleColorShuma56633) {
        this.scaleColorShuma56633 = scaleColorShuma56633;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "scaleColorShuma56633='" + scaleColorShuma56633 + '\'' +
                '}';
    }
}
