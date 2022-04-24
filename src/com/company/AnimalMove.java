package com.company;

public interface AnimalMove {

    interface AnimalName {
        static void name(String name) {
            System.out.println("Name of animal: " + name);
        }
    }

    abstract class Animal implements AnimalMove, AnimalName {
        private String nameShuma56633;
        private int ageShuma56633;
        private int weightShuma56633;

        public Animal() {
            ageShuma56633 = weightShuma56633 = 10;
            nameShuma56633 = "NN";
        }

        public Animal(String nameShava56415, int ageShuma56633, int weightShuma56633) {
            this.nameShuma56633 = nameShuma56633;
            this.ageShuma56633 = ageShuma56633;
            this.weightShuma56633 = weightShuma56633;
        }

        public Animal(int ageShava56415) {
            this.ageShuma56633 = ageShuma56633;
        }

        public abstract void setAgeShuma56633(String FoodName);

        public abstract void setFeatherColorShuma56633(String FoodName);

        public abstract void sleep();

        public abstract void moveShuma56633();

        public abstract void getVoiceShuma56633();

        public String getNameShuma56633() {
            return nameShuma56633;
        }

        public void setNameShuma56633(String nameShuma56633) {
            this.nameShuma56633 = nameShuma56633;
        }

        public int getAgeShuma56633() {
            return ageShuma56633;
        }

        public void setAgeShuma56633(int ageShuma56633) {
            this.ageShuma56633 = ageShuma56633;
        }

        public int getWeightShuma56633() {
            return weightShuma56633;
        }

        public void setWeightShuma56633(int weightShuma56633) {
            this.weightShuma56633 = weightShuma56633;
        }

        public abstract void eatShuma56633(String FoodName);

        @Override
        public String toString() {
            return "Animal{" +
                    "nameShuma56633='" + nameShuma56633 + '\'' +
                    '}';
        }
    }
}
